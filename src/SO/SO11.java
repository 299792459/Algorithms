package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈乘方函数的实现〉
 *
 * @author 陈景
 * @create 2019/9/13 0013
 * @since 1.0.0
 */
public class SO11 {
    //boolean isinvalid=true;

    //定义一个全局变量result用来传参
    static double result;
    public static void main(String[] args){

        System.out.println(0.0000000000000000000000001111 == 0);
        System.out.println(0.0000000000000000000000000000 == 0);

        System.out.println(power(2, -4));
        System.out.println(power(2, 4));
        System.out.println(power(2, 0));
        System.out.println(power(0.00000000000000000000000000001, -1));
        System.out.println(power(0.00000000000000000000000000001, 1));
        System.out.println(power(0.00000000000000000000000000001, 0));
        System.out.println(power(0.00000000000000000000000000000, 0));
    }
    /**
     * 边界条件有底数为-1（求指数与1的结果，为1说明为奇数。）,0返回0,1返回1
     * 指数为负数（求其倒数），0返回1,1返回本身
     * @return
     */
    public static double power(double base,int exp){
        if(base==1||exp==0)
        {
            return 1;
        }
        if(base==0&&exp==0)
        {

            throw new RuntimeException("错误，底数和指数不可以同时为0");

        }
        if(base==0)
        {return 0;}
        if(base==1)
        {return 1;}
        if(exp==1)
        {return base;}

        result=0;
        if(exp<0)
        {
            result=1/calPow3(base,-exp);
        }
        if(exp>0){
            result=calPow3(base,exp);
        }
        return result;
    }

    /**
     * 效率较低的方法。
     * @param base
     * @param exp
     * @return
     */
    public static double calPow1(double base,int exp){
        result=1;
        for(int i=0;i<exp;i++)
        {
            result=result*base;
        }
        return result;
    }

    /**
     *
     * @param base
     * @param exp
     * @return
     */
    public static double calPow2(double base,int exp){
            result=1;
            if(exp==1)
            {
                result=base;
                return result;
            }
            if(exp==0) {
                result = 1;
                return result;
            }
            // 递归求一半的值
            double result = calPow2(base, exp >> 1);

            // 求最终的值，如果是奇数就还要剩以一次底数
            result *= result;
            if ((exp&1)!=0) {
                result *= base;
            }
        return result;
    }

    /**
     * 和第二种方法一样，但是不用递归，而是循环的方法
     * @param base
     * @param exp
     * @return
     */
    public static double calPow3(double base,int exp){
        int flag=0;
        if ((exp&1)!=0)
        {
            flag=1;
        }
        result=base;
        while(exp!=1)
        {
            exp=exp>>1;
            result*=result;
        }
        if(flag==1)
        {
            result *= base;
        }
        return result;
    }
}
