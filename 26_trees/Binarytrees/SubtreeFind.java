package Binarytrees;
public class SubtreeFind extends basicTree {
    static class BinaryTree3 extends BinaryTree {
        public static boolean isIdentical(
                Node node, Node subRoot) {
                    if (node == null && subRoot == null ) {//all are same until the both having null means until leaf nodes (base case)
                        return true;

                    } else if (node == null || subRoot== null || node.data != subRoot.data) {// either of one is not identical it may be null or different data
                        return false;
                    }

                    if (!isIdentical(node.left, subRoot.left)) { //checking left nodes 
                        return false;
                    }
                    if (!isIdentical(node.right, subRoot.right)) {//checking right nodes
                        return false;
                    }
                    return true;
        }

        public static boolean isSubtree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }
            if (root.data == subRoot.data) { //checking every node of root tree with root of subtree
                if (isIdentical(root, subRoot)) {//if roots are equal then checking nodes or childrens are identical or not
                    return true;
                }
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

    }

    public static void main(String[] args) {
        //    1
        //   /  \
        //  2    3
        // / \  / \
        // 4 5 6  7
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.left.right.left = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right = new Node(7);


        //  2
        // / \
        //4   5
        Node subtree = new Node(3);
        // subtree.root = new Node(2);
        subtree.left = new Node(4);
        subtree.right = new Node(5);
        // subtree.right.left = new Node(5);
        System.out.println(BinaryTree3.isSubtree(root,subtree));

    }
}
