import java.util.LinkedList;
import java.util.Queue;

public class identical {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static boolean levelcompare(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);

        while (!queue.isEmpty()) {
            TreeNode node1 = queue.poll();
            TreeNode node2 = queue.poll();

            if (node1 == null && node2 == null)
                continue;
            if (node1 == null || node2 == null)
                return false;
            if (node1.val != node2.val)
                return false;

            queue.add(node1.left);
            queue.add(node2.left);
            queue.add(node1.right);
            queue.add(node2.right);
        }

        return true;
    }

    public static void main(String[] args) {

        identical p = new identical();
        TreeNode root = p.new TreeNode(1);
        root.right = p.new TreeNode(2);
        root.left = p.new TreeNode(3);
        TreeNode root2 = p.new TreeNode(1);
        root2.right = p.new TreeNode(2);
        // root2.left = p.new TreeNode(3);
        System.out.println(levelcompare(root, root2));
        System.out.println(isSameTree(root, root2));
    }
}