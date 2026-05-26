package BST;

import java.util.ArrayList;

public class MergedBSTs extends BuildTree {

    public static Node getBalancedBST(ArrayList<Integer> arr, int st, int ed){
        if (st>ed) {
            return null;
        }

        int mid = st + (ed - st)/2;
        // create a root with mid val
        Node root = new Node(arr.get(mid));
        root.left = getBalancedBST(arr, st, mid-1);
        root.right = getBalancedBST(arr, mid + 1, ed);
        return root;
    }

    public static void getInorder(Node root, ArrayList<Integer> inOrder){

        if (root == null) {
            return;
        }

        getInorder(root.left, inOrder);
        inOrder.add(root.data);
        getInorder(root.right, inOrder);
    }
    
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> finalArray = new ArrayList<>();
        int i = 0, j=0;
        while (i<arr1.size() && j<arr2.size()) {
            if (arr1.get(i)<=arr2.get(j)) {
                finalArray.add(arr1.get(i));
                i++;
            }else{
                finalArray.add(arr2.get(j));
                j++;
            }
        }

        while (i<arr1.size()) {
            finalArray.add(arr1.get(i));
            i++;
        }
        while (j<arr2.size()) {
            finalArray.add(arr2.get(j));
            j++;
        }
        
        return finalArray;

    }

    public static Node merge2BSTs(Node root1, Node root2){
        ArrayList<Integer> inOrder1 = new ArrayList<>();
        ArrayList<Integer> inOrder2 = new ArrayList<>();
        ArrayList<Integer> inOrder = new ArrayList<>();
        
        // get inOrder seq of 2 BSTs
        getInorder(root1, inOrder1);
        getInorder(root2, inOrder2);

        // merge sorted array
        inOrder = mergeArrays(inOrder1,inOrder2);

        // get balanced BST using sorted Array
        Node root = getBalancedBST(inOrder, 0, inOrder.size()-1);

        return root;
    }
    
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(5);
        root2.left = new Node(3);
        root2.right = new Node(9);
        // tc = O(n+m) -> linear time
        // 1,2,3,4,5,9

        Node root = null;
        root = merge2BSTs(root1, root2);
        preOrder(root);
    }
}
