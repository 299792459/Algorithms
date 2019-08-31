package Alg.simplesort;

/**
 * 〈一句话功能简述〉<br>
 * 〈希尔排序〉
 *
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Shell {

    int []arr;
    int a[],n;
    public Shell(int []arr){
        this.arr=arr;
        a=arr;
        n=arr.length;
    }
    public int[] Sort()
    {
        int d, i, j, temp; //d为增量
        for(d = n/2;d >= 1;d = d/2) //增量递减到1使完成排序
        {
            for(i = d; i < n;i++)   //插入排序的一轮
            {
                temp = a[i];
                for(j = i - d;(j >= 0) && (a[j] > temp);j = j-d)
                {
                    a[j + d] = a[j];
                }
                a[j + d] = temp;
            }
        }

        return arr;
    }
}
