package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈链表倒数第k个节点〉
 *
 * @author 陈景
 * @create 2019/9/16 0016
 * @since 1.0.0
 */
public class SO15 {
    public static class ListNode {
        int value;
        ListNode next;
    }

    public static ListNode getK(ListNode head,int k){
        if(head==null||k<1)
        {
            throw new RuntimeException("对不起，您的输入有误，链表不能为空并且k大于0");

        }
        //ListNode result=null;
        ListNode slow=head;
        ListNode fast=head;
        while (k-1!=0)
        {
            --k;
            if(fast.next==null)
            {

                return head;
                //throw new RuntimeException("抱歉，您的k比链表长度还大");
            }
            fast=fast.next;
        }
        while (fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode();
        head.value = 1;

        head.next = new ListNode();
        head.next.value = 2;

        head.next.next = new ListNode();
        head.next.next.value = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.value = 4;

        head.next.next.next.next = new ListNode();
        head.next.next.next.next.value = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.value = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.value = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.value = 8;

        head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.value = 9;

        System.out.println(getK(head, 1).value); // 倒数第一个
        System.out.println(getK(head, 5).value); // 中间的一个
        System.out.println(getK(head, 9).value); // 倒数最后一个就是顺数第一个

        System.out.println(getK(head, 10));
    }
}
