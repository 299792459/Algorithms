package SO;

/**
 *
 *找到数组中重复的数字
 * @author 陈景
 * @date 2019.08.31
 */
public class SO1 {
//中文
    public static void main(String []args){
        int []arr={2,2,3,1,4,3,5,0};
        //new SO1().ac1(arr);
        new SO1().ac2(arr);
    }

    public void ac1(int []arr){
        //鲁棒性！
        //1.输入边界
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>arr.length-1)||arr[i]<0)
            {
                System.out.println("数组值不在边界条件内");
                return;
            }
        }
        //2.越界
        if(arr.length<1)
        {
            System.out.println("无效数组");
            return;
        }

        //正式处理
        int []duparr=new int[8];
        for(int i=0;i<arr.length;i++)
        {
            duparr[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            duparr[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(duparr[i]>=2)
            {
                System.out.println("数字"+i+"重复了"+(duparr[i]-1)+"次");
            }
        }
    }

    /**
     * 第二种实现方式，不需要辅助数组
     * @param arr
     */
    public void ac2(int []arr){
        //鲁棒性！
        //1.输入边界
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]>arr.length-1)||arr[i]<0)
            {
                System.out.println("数组值不在边界条件内");
                return;
            }
        }
        //2.越界
        if(arr.length<1)
        {
            System.out.println("无效数组");
            return;
        }

        //具体实现
        //定义一个数组存放找到的数
        int dup[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            dup[i]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i)
            {
                if(arr[i]!=arr[arr[i]])
                {
                    int temp=0;
                    temp=arr[i];
                    arr[i]=arr[arr[i]];
                    arr[arr[i]]=temp;


                }
                dup[arr[i]]++;
            }

        }
        for(int i=0;i<dup.length;i++) {

            if(dup[i]>0)
            {
                System.out.println("数字"+i+"重复了");
            }
        }

    }

}

