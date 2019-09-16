package SO;



/**
 * 〈一句话功能简述〉<br>
 * 〈合并两个排序链表〉
 *
 * @author 陈景
 * @create 2019/9/16 0016
 * @since 1.0.0
 */
public class SO18 {
    public static class ListNode{
        int value;
        ListNode next;
    }
    public static ListNode check(ListNode head1,ListNode head2){
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        if (head1==null&&head2==null)
        {
            throw new RuntimeException("都是空指针！");
        }
        return MergeList(head1,head2);
    }

    public static ListNode MergeList(ListNode head1,ListNode head2){


        // 如果第一个链表为空，返回第二个链表头结点
        if (head1 == null) {
            return head2;
        }

        // 如果第二个链表为空，返回第一个链表头结点
        if (head2 == null) {
            return head1;
        }
        ListNode newhead=null;

            if (head1.value < head2.value) {
                // 如果第一个链表的头结点小，就递归处理第一个链表的下一个结点和第二个链表的头结点
                newhead=head1;
                newhead.next = MergeList(head1.next, head2);
            } else {
                newhead = head2;
                newhead.next = MergeList(head1, head2.next);
            }
        return newhead;
    }

    public static void printList(ListNode head){
        while (head!=null)
        {
            System.out.print(head.value);
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        head1.value = 1;

        head1.next = new ListNode();
        head1.next.value = 2;

        head1.next.next = new ListNode();
        head1.next.next.value = 3;

        head1.next.next.next = new ListNode();
        head1.next.next.next.value = 4;

        head1.next.next.next.next = new ListNode();
        head1.next.next.next.next.value = 5;


        ListNode head2 = new ListNode();
        head2.value = 1;

        head2.next = new ListNode();
        head2.next.value = 3;

        head2.next.next = new ListNode();
        head2.next.next.value = 5;

        head2.next.next.next = new ListNode();
        head2.next.next.next.value = 6;

        head2.next.next.next.next = new ListNode();
        head2.next.next.next.next.value = 7;

        printList(head1);
        printList(head2);

        printList(check(head1,head2));
    }
}
