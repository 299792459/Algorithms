package Alg;

import Alg.QuickSort.Quick;

/**
 * 〈一句话功能简述〉<br>
 * 〈用来测试排序的性能〉

 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Test {
    static String d;
    public static void main(String []args){
        int []arr={9,7,5,3,1,2,4,6,8};
        //arr=new Selection(arr).sort();
        for (int x:arr) {
            System.out.print(" "+x);
        }
/**
        System.out.println(" ");
        //arr=new Bubble(arr).Sort();
        for (int x:arr) {
            System.out.print(" "+x);
        }

        System.out.println(" ");
        arr=new Insert(arr).Sort();
        for (int x:arr) {
            System.out.print(" "+x);
        }

        System.out.println(" ");
        arr=new Shell(arr).Sort();
        for (int x:arr) {
            System.out.print(" "+x);
        }
 */
        System.out.println(" ");
        arr=new Quick(arr).Sort(0,arr.length-1);
        for (int x:arr) {
            System.out.print(" "+d);

        }


    }

}
