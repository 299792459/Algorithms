package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈二叉树的镜像〉
 *
 * @author 陈景
 * @create 2019/9/17 0017
 * @since 1.0.0
 */
public class SO20 {
    /**
     * 二叉树类
     */
    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public static BinaryTreeNode mirrorBT(BinaryTreeNode root){
        if(root==null)
        {
            throw new RuntimeException("空树");
        }

        if(root.left==null&&root.right==null)
        {
            return root;
        }
        BinaryTreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left!=null)
        {
            root.left=mirrorBT(root.left);
        }
        if(root.right!=null)
        {
            root.right=mirrorBT(root.right);
        }


        return root;
    }

    public static void printTree(BinaryTreeNode node) {
        if (node != null) {

            System.out.print(node.value + " ");
            printTree(node.left);
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        //       8
        //    /    \
        //   6     10
        //  / \   / \
        // 5   7 9  11
        BinaryTreeNode root = new BinaryTreeNode();
        root.value = 8;
        root.left = new BinaryTreeNode();
        root.left.value = 6;
        root.left.left = new BinaryTreeNode();
        root.left.left.value = 5;
        root.left.right = new BinaryTreeNode();
        root.left.right.value = 7;
        root.right = new BinaryTreeNode();
        root.right.value = 10;
        root.right.left = new BinaryTreeNode();
        root.right.left.value = 9;
        root.right.right = new BinaryTreeNode();
        root.right.right.value = 11;
        printTree(root);
        System.out.println();
        mirrorBT(root);
        printTree(root);
        //         1
        //        /
        //       3
        //      /
        //     5
        //    /
        //   7
        //  /
        // 9
        BinaryTreeNode root2 = new BinaryTreeNode();
        root2.value = 1;
        root2.left = new BinaryTreeNode();
        root2.left.value = 3;
        root2.left.left = new BinaryTreeNode();
        root2.left.left.value = 5;
        root2.left.left.left = new BinaryTreeNode();
        root2.left.left.left.value = 7;
        root2.left.left.left.left = new BinaryTreeNode();
        root2.left.left.left.left.value = 9;
        System.out.println("\n");
        printTree(root2);
        System.out.println();
        mirrorBT(root2);
        printTree(root2);

        // 0
        //  \
        //   2
        //    \
        //     4
        //      \
        //       6
        //        \
        //         8
        BinaryTreeNode root3 = new BinaryTreeNode();
        root3.value = 0;
        root3.right = new BinaryTreeNode();
        root3.right.value = 2;
        root3.right.right = new BinaryTreeNode();
        root3.right.right.value = 4;
        root3.right.right.right = new BinaryTreeNode();
        root3.right.right.right.value = 6;
        root3.right.right.right.right = new BinaryTreeNode();
        root3.right.right.right.right.value = 8;
        System.out.println("\n");
        printTree(root3);
        System.out.println();
        mirrorBT(root3);
        printTree(root3);

        BinaryTreeNode root4 =null;
        System.out.println("\n");
        printTree(root4);
        System.out.println();
        mirrorBT(root4);
        printTree(root4);
    }

}
