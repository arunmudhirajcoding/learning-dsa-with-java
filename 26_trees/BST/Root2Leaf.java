package BST;

import java.util.ArrayList;

public class Root2Leaf extends BuildTree {

    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");

        }
        System.out.println("Null");
    }
    
    public static void printRoot2Leaf(Node root , ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        
        // add current root
        path.add(root.data);

        // print when leaf appears
        if (root.left == null && root.right == null) {
            printPath(path);
        }

        // travel to left and right
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);

        // remove after both nodes 
        path.remove(path.size()-1);
    }
    public static void main(String[] args) {
        int values[] = {1, 2, 5, 7, 4,3};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printRoot2Leaf(root, new ArrayList<>());
    }
}
