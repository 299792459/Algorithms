package SO;

/**
 * 〈请实现一个函数，把字符串中的每个空格替换成"%20"，
 * 例如“We are happy.“，则输出”We%20are%20happy.“〉<br>
 * 〈剑指offer第三题〉
 *
 * @author 陈景
 * @create 2019/8/31 0031
 * @since 1.0.0
 */

public class SO3 {

    public static void main(String []args){
        String str="We are happy";
        System.out.println(new SO3().MyReplaceStr(str));
    }
    public String MyReplaceStr(String str){
        //1.判断输入是否合法
        if(str==null)
        {
            return new String("输入不合法");
        }
        int blank=0;
        char []ca=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(ca[i]==' ')
            {
                blank++;
            }
        }
        char []ns=new char[str.length()+blank*2];
        int nl=ns.length-1;
        for(int i=ca.length-1;i>=0;i--)
        {
            if(ca[i]==' ')
            {
                ns[nl--]='0';
                ns[nl--]='2';
                ns[nl--]='%';
            }
            else
            {
                ns[nl--]=ca[i];
            }
        }

        return new String(ns);
    }

}
