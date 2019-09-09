package SO;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈2个栈实现队列〉
 *
 * @author 陈景
 * @create 2019/9/9 0009
 * @since 1.0.0
 */
public class SO6 {

    class MyQueue
    {
        private Stack s1=new Stack();
        private Stack s2=new Stack();
        public int deleteHead(){
            if(s1.empty())
            {
                if(s2.empty())
                {
                    System.out.println("队列为空");
                }
                else
                {
                    return (int)s2.pop();
                }
            }
            int len=s1.size();
            for(int x=0;x<len;x++)
            {
                s2.push(s1.pop());
            }
            return (int)s2.pop();
        }
        public void appendTail(int data){
            s1.push(data);
        }
    }
    public static void main(String[] args){
        MyQueue mq1=new SO6().getmyqueue();
        mq1.appendTail(1);
        mq1.appendTail(2);
        mq1.appendTail(3);
        mq1.appendTail(4);
        System.out.println(mq1.deleteHead());
        System.out.println(mq1.deleteHead());
    }
    public MyQueue getmyqueue(){
        return new MyQueue();
    }

}
