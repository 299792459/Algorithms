package Alg.simplesort;

import Alg.MyTool;

/**
 * 〈一句话功能简述〉<br>
 * 〈插入排序〉
 *
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Insert {
    int []arr;
    public Insert(int []arr){
        this.arr=arr;
    }

    public int[] Sort() {
        int i=0,j=0;
        //对于数组里的每一个元素
        for(i=1;i<arr.length;i++)
        {
            //从左往右遍历他前面的元素
            for(j=0;j<=i;j++)
            {
                //找到第一个比他大的元素
                if(arr[i]<arr[j])
                {
                    //记下二者位置
                    int x=i;
                    //不断地从右往左交换，每次交换，i的位置减一，直到二者位置相等或者到最左端
                    while(x!=j&&x>=0)
                    {
                        MyTool.exch(arr,x,x-1);
                        x=x-1;
                    }
                }
            }
        }
        return arr;
    }
}
