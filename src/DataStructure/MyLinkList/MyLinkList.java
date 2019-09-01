package DataStructure.MyLinkList;

/**
 * 〈一句话功能简述〉<br>
 * 〈链表〉
 *
 * @author 陈景
 * @create 2019/9/1 0001
 * @since 1.0.0
 */
public class MyLinkList {
        //链表中的节点，data代表节点的值，next是指向下一个节点的引用
        class Node {
            Node next = null;
            // 节点的引用，指向下一个节点
            int data;
            // 节点的对象，即内容
            public Node(int data) {
                this.data = data;
                //length=length();
            }
        }
        // 头节点
        Node head = null;
        //private int length;
        //向链表中插入数据
        public void addNode(int d) {
            // 实例化一个节点
            Node newNode = new Node(d);
            if (head == null) {
                head = newNode;
                return;
            }

            //从首节点遍历到底，然后把新节点接上去
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }

        //index:删除第index个节点
        //这里C语言要回收内存，java不用自己写，还挺难受的...
        public boolean deleteNode(int index) {
            if (index < 0 || index > (length()-1)) {
                System.out.println("越界,请重新输入");
                return false;
            }
            if (index == 0) {
                head = head.next;
                return true;
            }

            //从头遍历到第n个节点，然后删掉
            if(index<=(length()-1)&&index>0)
            {
                Node preNode=head;
                Node curNode=preNode.next;
                while (index!=0)
                {
                    preNode=curNode;
                    curNode=preNode.next;
                    --index;
                }
                preNode=preNode.next;
                System.out.println("删除成功");
            }
            return false;
        }

        //return 返回节点长度
        private int length() {
            int length = 0;
            Node tmp = head;
            while (tmp != null) {
                length++;
                tmp = tmp.next;
            }
            return length;
        }



        public void printList() {
            Node tmp = head;
            System.out.println();
            while (tmp != null) {
                System.out.print(" "+tmp.data);
                tmp = tmp.next;
            }
            System.out.println();
        }

        //修改指定的节点值。下标从1开始
        public boolean updateList(int index,int data){
            //index-=1;
            if(index==0)
            {
                head.data=data;
                System.out.println("修改成功");
                return true;

            }
            if(index>(length()-1))
            {

                System.out.println("超出链表长度，请重新输入");
                return false;
            }
            if(index<=(length()-1)&&index>0)
            {
                Node preNode=head;
                Node curNode=preNode.next;
                while (index!=0)
                {
                    preNode=curNode;
                    curNode=preNode.next;
                    index--;
                }
                preNode.data=data;
                System.out.println("修改成功");
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            MyLinkList list = new MyLinkList();
            list.addNode(1);
            list.addNode(2);
            list.addNode(3);
            list.addNode(4);
            list.addNode(5);
            list.addNode(6);

            System.out.println("linkLength:" + list.length());

            System.out.println("head.data:" + list.head.data);

            //输出链表的
            list.printList();

            //测试删除第N个节点

            if(list.deleteNode(6))
            {
                System.out.println("删除后的链表");
                list.printList();
            }

            //测试修改第N个节点的值
            if(list.updateList(5,33))
            {
                System.out.println("修改后的链表");
                list.printList();
            }

        }

}
