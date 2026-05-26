package BST;

import java.util.ArrayList;

public class BalanacedBST extends BuildTree {

    public static void getInorder(Node root, ArrayList<Integer> inOrder){

        if (root == null) {
            return;
        }

        getInorder(root.left, inOrder);
        inOrder.add(root.data);
        getInorder(root.right, inOrder);
    }
    
    public static Node bst2BalanacedTree(Node root){
        // to store inorder arr (sorted array)
        ArrayList<Integer> inOrder = new ArrayList<>();
        // creating inOrder
        getInorder(root, inOrder);

        // creating Balamced tree using sorted Array
        root = createBalancedTree(inOrder, 0, inOrder.size()-1);
        
        return root;
    }


    public static Node createBalancedTree(ArrayList<Integer> arr, int st, int ed){
        if (st>ed) {
            return null;
        }

        int mid = st + (ed - st)/2;
        // create a root with mid val
        Node root = new Node(arr.get(mid));
        root.left = createBalancedTree(arr, st, mid-1);
        root.right = createBalancedTree(arr, mid + 1, ed);
        return root;
    }

    public static Node balancedTree(int[] arr, int st, int ed){
        if (st>ed) {
            return null;
        }

        int mid = st + (ed - st)/2;
        // create a root with mid val
        Node root = new Node(arr[mid]);
        root.left = balancedTree(arr, st, mid-1);
        root.right = balancedTree(arr, mid + 1, ed);
        return root;
    }

    
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        // Node root = balancedTree(arr,0,arr.length-1);
        // inOrder(root);

        Node root2 = null;

        for (int i = 0; i < arr.length; i++) {
            root2 = insert(root2, arr[i]);
        }

        System.out.println("Before balancing:");
        preOrder(root2);

        root2 = bst2BalanacedTree(root2);

        System.out.println("\nAfter balancing:");
        preOrder(root2);
    }
}
