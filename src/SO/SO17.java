package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈输出反转链表〉
 *
 * @author 陈景
 * @create 2019/9/16 0016
 * @since 1.0.0
 */
public class SO17 {
    public static class ListNode {
        int value;
        ListNode next;
    }
    public static ListNode check(ListNode head){
        if(head==null)
        {
            throw new RuntimeException("空指针！");
        }
        if(head.next==null)
        {
            return head;
        }
        else
        {
            head=reverseList(head);
        }

        return head;
    }

    public static ListNode reverseList(ListNode head){
        ListNode tail=head;
        ListNode toLink;
        while (tail.next!=null)
        {
            tail=tail.next;
        }
        while (head!=tail)
        {
            toLink=head;
            head=head.next;
            toLink.next=tail.next;
            tail.next=toLink;
        }
        return tail;
    }

    public static void printList(ListNode head){
        while (head!=null)
        {
            System.out.print(head.value);
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
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

        printList(head);
        printList(check(head));

    }
}
