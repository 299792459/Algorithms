package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈删除指定指针的链表节点〉
 *
 * @author 陈景
 * @create 2019/9/13 0013
 * @since 1.0.0
 */
public class SO13 {
    class ListNode{
        ListNode next;
        int data;
    }
    ListNode head=null;

    public static void printList(ListNode headp){
        while (headp.next!=null)
        {
            System.out.print(headp.data);
            headp=headp.next;
        }
        System.out.println();
    }


    public static void deleteNode(ListNode head,ListNode toBeDeleted){
        if(head==null||toBeDeleted==null)
        {
            System.out.println("空指针");
            return;
        }
        if(head.equals(toBeDeleted))
        {
            head=null;
            return;

        }
        if(toBeDeleted.next==null)
        {
            toBeDeleted=null;
            return;
        }
        else
        {
            ListNode tail=head;
            toBeDeleted=toBeDeleted.next;
            while(tail.next!=null)
            {
                tail=tail.next;
            }
            tail=null;
        }
    }

    public static void main(String[] args)
    {
        new SO13().test();
    }
    public void test() {


        ListNode head = new ListNode();
        head.data = 1;

        head.next = new ListNode();
        head.next.data = 2;

        head.next.next = new ListNode();
        head.next.next.data = 3;

        head.next.next.next = new ListNode();
        head.next.next.next.data = 4;

        ListNode middle = head.next.next.next.next = new ListNode();
        head.next.next.next.next.data = 5;

        head.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.data = 6;

        head.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.data = 7;

        head.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.data = 8;

        ListNode last = head.next.next.next.next.next.next.next.next = new ListNode();
        head.next.next.next.next.next.next.next.next.data = 9;

        deleteNode(head, null); // 删除的结点为空
        printList(head);
        ListNode node = new ListNode();
        node.data = 12;

        deleteNode(head, head); // 删除头结点
        printList(head);
        deleteNode(head, last); // 删除尾结点
        printList(head);
        deleteNode(head, middle); // 删除中间结点
        printList(head);

        deleteNode(head, node); // 删除的结点不在链表中
        printList(head);
    }

}
