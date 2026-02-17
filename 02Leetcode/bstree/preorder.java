import java.util.ArrayList;
import java.util.List;

public class preorder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderTraversal(list, root);
        return list;
    }

    public static void preOrderTraversal(List<Integer> list, TreeNode root) {
        if (root == null)
            return;
        list.add(root.val);
        preOrderTraversal(list, root.left);
        preOrderTraversal(list, root.right);

    }

    public static void main(String[] args) {
        preorder p = new preorder();
        TreeNode root = p.new TreeNode(1);
        root.right = p.new TreeNode(2);
        root.right.left = p.new TreeNode(3);
        List<Integer> foo = new ArrayList<>();
        
       foo= preorderTraversal(root);
       System.out.println(foo);
    }
}
