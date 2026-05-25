package BST;
public class basic {
    //searching in BST is like binary search. only one substree need to search.
    //tc = O(H) where H = logN(in bestcase) or H = N(in worst case)
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
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

    public static boolean search(Node root, int key){
        if (root == null) {
            return false;
        }

        if (key == root.data) {
            return true;
        }else if (key > root.data) {
            return search(root.right, key);
        }else{
            return search(root.left, key);
        }
        // return false;
    }

    // delete
    public static void delete(Node root, int key){
        if (root == null) {
            return;
        }

        if (key == root.data) {
            // arrangement
            root = null;

            return;
        }else if (key > root.data) {
            delete(root.right, key);
        }else{
            delete(root.left, key);
        }
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {1, 2, 5, 7, 4,3};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println(search(root, 7));
        
    }
    

    
}
