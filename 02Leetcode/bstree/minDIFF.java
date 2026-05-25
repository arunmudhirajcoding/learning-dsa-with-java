public class minDIFF {
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

    public static int min  = Integer.MAX_VALUE;
    public static int minDifference(TreeNode root){
        if (root == null) {
            return 0;
        }
        int lh = minDifference(root.left);
        int rh = minDifference(root.left);
        int height = lh + rh + 1;
        return min = Math.min(min,height);
    }

    public static void main(String[] args) {
        minDIFF tree = new minDIFF();
        TreeNode root = tree.new TreeNode();
        root.right = tree.new TreeNode(2);
        root.right = tree.new TreeNode(4);
        root.right.left = tree.new TreeNode(3);
        System.out.println(minDifference(root));

    }
}
