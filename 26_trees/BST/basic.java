package BST;
public class basic extends BuildTree {
    //searching in BST is like binary search. only one substree need to search.
    //tc = O(H) where H = logN(in bestcase) or H = N(in worst case)
    

    
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
    public static Node delete(Node root, int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if(root.data > val){
            root.left = delete(root.left, val);
        }else{ // data == val
            //  case 1 - leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 - single child 
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children
            //  find left most node of right subtree
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    // helper function for delete
    public static Node findInorderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
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
        root = delete(root, 1);
        System.out.println();
        inOrder(root);
        
    }
    

    
}
