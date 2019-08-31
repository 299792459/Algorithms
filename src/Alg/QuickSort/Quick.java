package Alg.QuickSort;

/**
 * 〈一句话功能简述〉<br>
 * 〈快速排序！！！〉
 *
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class Quick {
    int []arr;
    public Quick(int []arr){
        this.arr=arr;
    }
    public int getkey(int left,int right){
        int key=arr[left];
        int temp=0;
        while(left<right)
        {
            while(arr[left]<key) {left++;}
            while(arr[right]>key) {right--;}
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
        temp=arr[left];
        arr[left]=key;
        key=temp;

        return left;
    }

    public int[] Sort(int left,int right){
        if (left < right)
        {
            //先成挖坑填数法调整s[]
            int key = getkey(left, right);
            // 递归调用
            Sort(left,key - 1);
            Sort(key + 1, right);
        }
        return arr;
    }
}
