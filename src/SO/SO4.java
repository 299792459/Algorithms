package SO;

import java.util.Stack;

/**
 * 〈一句话功能简述〉<br>
 * 〈倒序输出链表值〉
 *
 * @author 陈景
 * @create 2019/9/3 0003
 * @since 1.0.0
 */
public class SO4 {
    static class ListNode {
        int val; // 结点的值
        ListNode nxt; // 下一个结点
    }

    /**
     * 没有指针真的好痛苦！！！java自带的LinkedList没有next！！！
     * @param args
     */
    public static void main(String []args){
        ListNode root = new ListNode();
        root.val = 1;
        root.nxt = new ListNode();
        root.nxt.val = 2;
        root.nxt.nxt = new ListNode();
        root.nxt.nxt.val = 3;
        root.nxt.nxt.nxt = new ListNode();
        root.nxt.nxt.nxt.val = 4;
        root.nxt.nxt.nxt.nxt = new ListNode();
        root.nxt.nxt.nxt.nxt.val = 5;

        if(root==null)
        {
            System.out.println("非法输入！");
            new SO4();
        }
        printListInverselyUsingIteration1(root);
        System.out.println();
        printListInverselyUsingRecursion2(root);

    }

    /**
     * 递归方法，如果太长会造成栈溢出
     * @param root
     */
    public static void printListInverselyUsingIteration1(ListNode root){
        if (root != null) {
            printListInverselyUsingIteration1(root.nxt);
            System.out.print(root.val + " ");
        }
    }

    /**
     * 栈方法
     * @param root
     */
    public static void printListInverselyUsingRecursion2(ListNode root) {
        Stack<ListNode> stack = new Stack<>();
        
        while (root != null) {
            stack.push(root);
            root = root.nxt;
        }
        ListNode tmp;
        while (!stack.isEmpty()) {
            tmp = stack.pop();
            System.out.print(tmp.val + " ");
        }
    }
}
