package DataStructure.MyTree;

/**
 * 〈一句话功能简述〉<br>
 * 〈二叉树〉
 *
 * @author 陈景
 * @create 2019/9/2 0002
 * @since 1.0.0
 */
public class MyTree {
    /**
     * 定义内部类作为叶子结点
     */
    class Node {
        Node leftChild;
        Node rightChild;
        int data;

        Node(int newData) {
            leftChild = null;
            rightChild = null;
            data = newData;
        }
    }

    private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    

}
