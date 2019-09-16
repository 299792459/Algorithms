package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈将数组中奇数放在前面，偶数放在后面〉
 *  其实就是快速排序的方法
 * @author 陈景
 * @create 2019/9/16 0016
 * @since 1.0.0
 */
public class SO14 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9,0};
        for (int num:arr
             ) {
            System.out.print(" "+num);
        }
        System.out.println();
        arr=reorder(arr);
        for (int num:arr
        ) {
            System.out.print(" "+num);
        }

    }
    public static int[] reorder(int[] arr){
        if(arr==null||arr.length<=1)
        {
            throw new RuntimeException("非法输入");
        }
        int left=0;
        int right=arr.length-1;
        int temp=0;
        while(left<right)
        {
            while (isLeft(arr[left]))
            {
                ++left;
            }
            while (!isLeft(arr[right]))
            {
                --right;
            }
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            }
        return arr;
    }
    public static boolean isLeft(int num)
    {
        if((num&1)==1)
        {
            return true;
        }
        return false;
    }
}
