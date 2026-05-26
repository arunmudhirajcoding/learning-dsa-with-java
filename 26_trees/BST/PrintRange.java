package BST;

public class PrintRange extends BuildTree {
    public static void printInRange(Node root, int k1, int k2){
        // if null
        if (root == null) {
            return;
        }

        // case-1 k1<data>k2
        if (root.data>=k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.println(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if(root.data < k1){ // case 2
            printInRange(root.left, k1, k2);

        }else{ // case 3
            printInRange(root.right, k1, k2);
        }

    }
    
    public static void main(String[] args) {
        int values[] = {1, 2, 5, 7, 4,3};
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        

        root.right.right = new Node(6);
        
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printInRange(root, 1, 4);
    }
}
