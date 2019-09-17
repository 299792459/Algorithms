package SO;

/**
 * 〈一句话功能简述〉<br>
 * 〈二叉树的子结构〉
 *
 * @author 陈景
 * @create 2019/9/17 0017
 * @since 1.0.0
 */
public class SO19 {
    /**
     * 二叉树类
     */
    public static class BinaryTreeNode{
        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    public static boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root1==root2)
        {
            return true;
        }

        if(root2==null)
        {
            return true;
        }

        if(root1==null)
        {
            return false;
        }

        boolean result=false;
        if(root1.value==root2.value){
            result=match(root1,root2);
        }
        if(result)
        {
            return true;
        }
        return hasSubTree(root1.left, root2) || hasSubTree(root1.right, root2);
    }

    public static boolean match(BinaryTreeNode root1,BinaryTreeNode root2){
        if(root1==root2)
        {
            return true;
        }

        if(root2==null)
        {
            return true;
        }
        if(root1==null)
        {
            return false;
        }
        if(root1.value==root2.value)
        {
            return match(root1.left,root2.left)&&match(root1.right,root2.right);

        }
        return false;
    }

    public static void main(String[] args){
        BinaryTreeNode root1=new BinaryTreeNode();
        root1.value=8;
        root1.right = new BinaryTreeNode();
        root1.right.value = 7;
        root1.left = new BinaryTreeNode();
        root1.left.value = 8;
        root1.left.left = new BinaryTreeNode();
        root1.left.left.value = 9;
        root1.left.right = new BinaryTreeNode();
        root1.left.right.value = 2;
        root1.left.right.left = new BinaryTreeNode();
        root1.left.right.left.left = new BinaryTreeNode();
        root1.left.right.left.left.value = 4;
        root1.left.right.left.right = new BinaryTreeNode();
        root1.left.right.left.right.value = 7;

        BinaryTreeNode root2 = new BinaryTreeNode();
        root2.value = 8;
        root2.left = new BinaryTreeNode();
        root2.left.value = 9;
        root2.right = new BinaryTreeNode();
        root2.right.value = 2;

        System.out.println(hasSubTree(root1, root2));
        System.out.println(hasSubTree(root2, root1));
        System.out.println(hasSubTree(root1, root1.left));
        System.out.println(hasSubTree(root1, null));
        System.out.println(hasSubTree(null, root2));
        System.out.println(hasSubTree(null, null));

    }
}
