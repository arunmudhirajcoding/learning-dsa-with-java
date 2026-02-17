package Binarytrees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class kth_level {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        // build tree using preorder nodes (data, left, right)
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {

                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

        // traversals tc=O(n) uses dfs(depth first search)

        // preorder(data, left, right)
        public static void preOrder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // InOrder(left, data, right)
        public static void inOrder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // postOrder(left, right, data)
        public static void postOrder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // level order
        public static void levelOrder(Node root) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null && q.isEmpty()) {
                    System.out.println();
                    break;
                }
                if (currNode == null) {
                    System.out.println();
                    q.add(null);
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                }
            }

        }

        public static int treeHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = treeHeight(root.left);
            int rh = treeHeight(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        public static int treeCount(Node root) {
            if (root == null) {
                return 0;
            }

            int lcount = treeCount(root.left);
            int rcount = treeCount(root.right);
            int count = (lcount + rcount) + 1;
            return count;
        }
        public static int treeSum(Node root) {
            if (root == null) {
                return 0;
            }

            int lsum = treeSum(root.left);
            int rsum = treeSum(root.right);
            int sum = (lsum + rsum) + root.data;
            return sum;
        }

        public static void Klevel(Node root, int level, int k){
            if(root==null){
                return;
            }
            if(level==k){

                System.out.print(root.data+" ");

                return;
            }

            Klevel(root.left,level+1,k);
            Klevel(root.right,level+1,k);
        }


        public static void
        public static void LCA(Node root, int n1, int n2){
            ArrayList<Integer> path1 = new ArrayList<>();
            ArrayList<Integer> path2 = new ArrayList<>();
            getPath(root, n1, path1);
            getPath(root, n2, path2);
            
            int i = 
        }

    }
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // tree.levelOrder(root);
        tree.Klevel(root,1,2);

        int n1 = 4 , n2 = 5;
        System.out.println(tree.LCA(root,n1,n2));
    }
}
