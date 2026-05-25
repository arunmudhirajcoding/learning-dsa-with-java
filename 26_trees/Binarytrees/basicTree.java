package Binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class basicTree {
    // define node having data, left node and right node

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

        public Node buildTree(int nodes[]) {
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
        public void inOrder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // postOrder(left, right, data)
        public void postOrder(Node root) {
            if (root == null) {
                // System.out.print("-1 ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // level order
        public void levelOrder(Node root) {
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

        public int treeHeight(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = treeHeight(root.left);
            int rh = treeHeight(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        public int treeCount(Node root) {
            if (root == null) {
                return 0;
            }

            int lcount = treeCount(root.left);
            int rcount = treeCount(root.right);
            int count = (lcount + rcount) + 1;
            return count;
        }
        public int treeSum(Node root) {
            if (root == null) {
                return 0;
            }

            int lsum = treeSum(root.left);
            int rsum = treeSum(root.right);
            int sum = (lsum + rsum) + root.data;
            return sum;
        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.left.data);
        System.out.println("\npreorder traversal:");
        tree.preOrder(root);
        System.out.println("\nInorder traversal:");
        tree.inOrder(root);
        System.out.println("\npostorder traversal:");
        tree.postOrder(root);
        System.out.println("\nlevelorder traversal:");
        tree.levelOrder(root);
        System.out.println();
        int height = tree.treeHeight(root);
        System.out.println("the height of tree : " + height);
        System.out.println("the count of tree : " + tree.treeCount(root));
        System.out.println("the sum of tree : " + tree.treeSum(root));

    }
}