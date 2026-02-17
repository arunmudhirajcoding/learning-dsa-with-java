import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class level {
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

    public static List<List<Integer>> levelOrder(TreeNode root) {
        // levelorder()
        List<List<Integer>> lists = new ArrayList<>();
        return lists;
    }

    public static void levelorder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return;
        }


        queue.add(root);

        lists.add(Arrays.asList(root.val));
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.remove();
                if (currNode.left != null) {
                    queue.add(currNode.left);
                    list.add(currNode.left.val);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                    list.add(currNode.right.val);
                }
            }
            if (list.size() > 0) {
                lists.add(list);
            }

        }

        System.out.println(lists);
    }

    public static void main(String[] args) {
        level p = new level();
        TreeNode root = p.new TreeNode(1);
        root.right = p.new TreeNode(3);
        root.left = p.new TreeNode(2);
        root.left.left = p.new TreeNode(4);
        root.right.right = p.new TreeNode(5);

        List<List<Integer>> foo = new ArrayList<>();
        levelorder(root);
        // foo.add(Arrays.asList(root));
        System.out.println(foo);
    }
}
