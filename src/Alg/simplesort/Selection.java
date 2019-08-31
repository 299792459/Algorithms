package Alg.simplesort;

import Alg.MyTool;

/**
 * 〈一句话功能简述〉<br>
 * 〈选择排序〉
 *  时间复杂度：
 *  空间复杂度：
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Selection {
    int []arr;
    public Selection(int []arr)
    {
        this.arr=arr;
    }

    public int[] sort()
    {
        int i=0,j=0,maxk=i;
        for(;i<arr.length;i++) {
            maxk=i;
            for (j=i;j<arr.length;j++){
                if(arr[j]>arr[maxk])
                {
                    maxk=j;
                }
            }
            if(maxk!=i)
            {
                MyTool.exch(arr,maxk,i);
            }
        }
        return arr;
    }
}
