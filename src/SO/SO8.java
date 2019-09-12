package SO;

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br>
 * 〈斐波那契数列〉
 *
 * @author 陈景
 * @create 2019/9/12 0012
 * @since 1.0.0
 */
public class SO8 {
    public static void main(String[] args){
        int n=0;
        System.out.println("请输入斐波那契数列的第N项");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        System.out.println(FibN2(n));
        System.out.println(FibN1(n));
    }

    /**
     * 递归方法
     * @param n
     * @return
     */
    public static int FibN1(int n){
        if(n<0)
        {
            return -1;
        }
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return FibN1(n-1)+FibN1(n-2);
    }
    /**
     * 循环方法
     * @param n
     * @return
     */
    public static int FibN2(int n){
        if(n<0)
        {
            return -1;
        }
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        int result=0,x0=0,x1=1;
        for (int i=2;i<=n;i++){
            result=x0+x1;
            x0=x1;
            x1=result;
        }
        return result;
    }

}
