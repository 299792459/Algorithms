package DataStructure.MyStack;

/**
 * 〈一句话功能简述〉<br>
 * 〈数组栈〉
 *
 * @author 陈景
 * @create 2019/9/2 0002
 * @since 1.0.0
 */
public class MyArrayStack {
    //定义一个栈类
    int SLength=11;
    int []Arrstack=new int[SLength];
    public MyArrayStack(){
        for(int i=0;i<SLength;i++)
        {
            Arrstack[i]=-1;
        }
    }
    //入栈方法
    public boolean push(int data){
        if(IsFull())
        {
            System.out.println("栈满,无法入栈");
            return false;
        }
        else
        {
            int temp=10;
            //先把元素后移
            int l=0,r=0;
            while (temp!=0)
            {
                temp--;
                Arrstack[temp+1]=Arrstack[temp];

            }
            //把新元素压入栈顶
            Arrstack[1]=data;
        }
        return false;
    }
    //出栈方法
    public int pop(){
        if(IsEmpty())
        {
            System.out.println("栈空，无法出栈");
            return -1;
        }
        int temp=1;
        int r=Arrstack[1];
        while (Arrstack[temp]!=-1)
        {
            Arrstack[temp]=Arrstack[temp+1];
            temp++;
            if(temp>9)
            {
                Arrstack[temp]=-1;
                break;
            }
        }
        System.out.println("");
        System.out.println(r+"出栈");
        return r;
    }

    //判断栈是否满
    public boolean IsFull(){
        if(Arrstack[SLength-1]==-1)
        {
            return false;
        }
        return true;
    }
    //判断栈是否空
    public boolean IsEmpty(){
        if(Arrstack[1]!=-1)
        {
            return false;
        }

        return true;
    }

    public void printStack(MyArrayStack s){
        for (int x:s.Arrstack)
        {
            if(x!=-1)
            {
                System.out.print(" "+x);
            }
        }
    }
    public static void main(String []args){
        MyArrayStack s=new MyArrayStack();

        if(s.IsEmpty())
        {
            System.out.println("栈空");
        }
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        s.push(5);
        if(s.IsFull())
        {
            //System.out.println("栈满");
        }
        s.printStack(s);
        System.out.println(" "+s.pop());
        System.out.println(" "+s.pop());
        System.out.println(" "+s.pop());
        System.out.println(" "+s.pop());
        System.out.println(" "+s.pop());
        System.out.println(" "+s.pop());
        s.printStack(s);
    }
}
