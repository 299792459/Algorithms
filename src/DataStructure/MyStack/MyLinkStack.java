package DataStructure.MyStack;

/**
 * 〈一句话功能简述〉<br>
 * 〈链表栈〉
 *
 * @author 陈景
 * @create 2019/9/2 0002
 * @since 1.0.0
 */
public class MyLinkStack {
    class Node{
        Node next=null;
        int data;
    }
    Node Top=null;

    /**
     * 入栈方法
     * @param data
     * @return
     */
    public boolean push(int data){
        if(isEmpty())
        {
            Top=new Node();
            Top.data=data;
            return true;
        }
        try {
            Node OldTop=Top;
            Node NewTop=new Node();
            NewTop.next=OldTop;
            NewTop.data=data;
            Top=NewTop;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("无法分配新内存");
            return false;
        }
        return true;
    }
    /**
     * 出栈方法
     * @return r
     */
    public int pop(){
        if(isEmpty())
        {
            System.out.println("栈空，无法出栈");
            //这里-1是权宜之策，好的做法应该是建立一个返回类，返回类有boolean表示是否成功
            //成功则附带返回值，否则不附带
            return -1;
        }
        int r=Top.data;
        Top=Top.next;
        return r;
    }

    /**
     *
     * @return 空则true
     */
    public boolean isEmpty(){
        if(Top!=null)
        {
            return false;
        }
        //只负责判断，处理语句应该放在外面调用的地方
        //System.out.println("空栈");
        return true;
    }

    /**
     *本来想写判断栈满的，想想似乎没有必要
     * 除非无法分配新内存
     * @return 满则true
     */

    /**
     * 遍历栈
     */
    public void printStack(){
        //为了避免影响栈，所以需要新开一个地址用来打印
        Node stack=Top;
        System.out.println();
        while (stack!=null)
        {
            System.out.print(" "+stack.data);
            stack=stack.next;
        }
        System.out.println();

    }

    public static void main(String []args){
        MyLinkStack ms=new MyLinkStack();
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);

        ms.printStack();
        while (true)
        {
            int x=ms.pop();
            if(x==-1)
            {
                break;
            }
            System.out.println(x+"出栈");
            System.out.println("出栈后的栈");
            ms.printStack();


        }


    }
}
