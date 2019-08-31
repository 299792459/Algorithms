package Alg;

/**
 * 〈一句话功能简述〉<br>
 * 〈一些自己实现的小工具，比如交换两个值什么的。〉
 *
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */
public class MyTool {
    public static void exch(int[] arr, int i, int j) {
        // 将元素交换位置
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
