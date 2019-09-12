package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈二进制中1的个数〉
 *
 * @author 陈景
 * @create 2019/9/12 0012
 * @since 1.0.0
 */
public class SO10 {
    public static void main(String[] args){
        int num=9;
        System.out.println(numofone3(num));

    }
    public static int numofone1(int n){
        // 记录数字中1的位数
        int result = 0;

        // JAVA语言规范中，int整形占四个字节，总计32位
        // 对每一个位置与1进行求与操作，再累加就可以求出当前数字的表示是多少位1
        for (int i = 0; i < 32; i++) {
            result += (n & 1);
            n >>>= 1;
        }

        // 返回求得的结果
        return result;
    }
    public static int numofone2(int n) {
        // 用来与n的每一位做与运算
        int flag = 1;
        //计数器
        int count=0;
        while(flag<=n)
        {
            //与运算有0出0！
            if((flag&n)!=0)
            {
                ++count;
            }
            flag=flag<<1;
        }

        return count;
    }

    public static int numofone3(int n) {
        //计数器
        int count=0;
        while(n!=0)
        {
            ++count;
            n=(n-1)&n;
        }

        return count;
    }
}
