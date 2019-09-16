package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈从1打印到第n位数（大数的表示）〉
 *
 * @author 陈景
 * @create 2019/9/13 0013
 * @since 1.0.0
 */
public class SO12 {
    public static void printNum(int[] arr) {
        // 找第一个非0的元素
        int index = 0;
        while (index < arr.length && arr[index] == 0) {
            index++;
        }

        // 从第一个非0值到开始输出到最后的元素。
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // 条件成立说明数组中有非零元素，所以需要换行
        if (index < arr.length) {
            System.out.println();
        }
    }

    public static void arrop(int n,int[] arr){
        if(n>=arr.length){
            printNum(arr);
        }
        else{
            for(int i=0;i<=9;i++){
                arr[n]=i;
                arrop(n+1,arr);
            }
        }
    }

    public static void printOneToNthDigits(int n){
        if(n<1){
            throw new RuntimeException("输入的位数不能小于1");
        }
        int[] arr=new int[n];
        arrop(0,arr);
    }
    public static void main(String[] args){
        printOneToNthDigits(1);
        System.out.println();

    }
}
