package Alg.simplesort;

import Alg.MyTool;

/**
 * 〈一句话功能简述〉<br>
 * 〈冒泡排序〉
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Bubble {
    int []arr;
    public Bubble(int []arr)
    {
        this.arr=arr;
    }
    public int[] Sort()
    {
        int i=0,j=0,maxk=i;
        for(;i<arr.length;i++) {
            for (j=i;j<arr.length;j++){
                if(arr[j]>arr[i])
                {
                    MyTool.exch(arr,i,j);
                }
            }
        }
        return arr;
    }
}
