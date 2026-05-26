package BST;

public class ValidBST extends BuildTree {
    // approach -1 check wheater the inorder is sorted or not

    // approach -2
    public static boolean isVaildBST(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }


        if (min != null && root.data <= min.data) {
            return false;
        }else if (max != null && root.data >= max.data) {
            return false;
        }

        return isVaildBST(root.left, min, root) && isVaildBST(root.right, root, max);
    }


    public static Node mirrorTree(Node root){
        if (root == null) {
            return null;
        }

        Node leftSTree = mirrorTree(root.left);
        Node rightSTree = mirrorTree(root.right);

        root.left = rightSTree;
        root.right = leftSTree;

        return root;
    }

    public static void main(String[] args) {
        // valid
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        

        root.right.right = new Node(7);

        // inVaild
        // Node root = new Node(3);
        // root.left = new Node(2);
        // root.right = new Node(5);
        
        // root.left.left = new Node(1);
        // root.left.right = new Node(4);

        inOrder(root);

        System.out.println(isVaildBST(root, null, null));

        mirrorTree(root);

        inOrder(root);
    }
}
