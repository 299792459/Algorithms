package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈重建二叉树〉
 *
 * @author 陈景
 * @create 2019/9/3 0003
 * @since 1.0.0
 */
public class SO5 {
    static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }


    public static void printTree(BinaryTreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.value + " ");
            printTree(root.right);
        }

    }
}
