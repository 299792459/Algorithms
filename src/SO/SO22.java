package SO;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈求栈中的最小值〉
 *
 * @author 陈景
 * @create 2019/9/17 0017
 * @since 1.0.0
 */
public class SO22 {
    public static class StackWithMin<T>{
        //数据栈，存放插入的数据
        private Stack<T> dataStack;
        //最小位置栈,存放数据栈中最小数的位置
        private Stack<T> minStack;

        //构造函数
        public StackWithMin(){
            this.dataStack=new Stack<>();
            this.minStack=new Stack<>();
        }

        public T pop(){
            if(dataStack.isEmpty())
            {
                throw new RuntimeException("抱歉，栈已空");
            }
            //两个栈同时出栈
            minStack.pop();
            return dataStack.pop();
        }

        public void push(T num){
            //如果数据栈是空的，直接元素入栈，同时更新最小栈中的数据
            if(dataStack.size()==0)
            {
                dataStack.push(num);
                minStack.push(num);
                return;
            }
            int numx=Integer.parseInt(num.toString());
            int minx=Integer.parseInt(minStack.peek().toString());
            if(numx>=minx)
            {
                dataStack.push(num);
                minStack.push(minStack.peek());
            }
            if(numx<minx)
            {
                dataStack.push(num);
                minStack.push(num);
            }
        }

        public int min(){
            if(dataStack.isEmpty())
            {
                throw new RuntimeException("抱歉，栈空");
            }
            return Integer.parseInt(minStack.peek().toString());
        }

    }

    public static void main(String[] args){
        StackWithMin s=new StackWithMin();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.min());
    }
}
