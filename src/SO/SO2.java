package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈第二题。二维数组的查找〉
 *
 * @author Administrator
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class SO2 {

    public static void main(String []args){
        int [][]arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int row=4,col=4;
        int data=13;
        boolean found=false;
        if(arr!=null&&row>0&&col>0)
        {
            int rowx=0,colx=col-1;
            while (rowx<row&&colx>=0)
            {
                if(arr[rowx][colx]==data)
                {
                    found=true;
                    break;
                }
                if(arr[rowx][colx]>data)
                {
                    colx--;
                }
                if(arr[rowx][colx]<data)
                {
                    rowx++;
                }
            }
            System.out.println("数字"+data+"在"+"行"+rowx+"列"+colx);











        }
        else
        {
            System.out.println("数组超过边界条件");
        }
    }
}
