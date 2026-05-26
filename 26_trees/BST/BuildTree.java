package BST;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    
    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {

            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void preOrder(Node root){
        if (root == null) {
            System.out.println("Null");
            return;

        }

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
}
