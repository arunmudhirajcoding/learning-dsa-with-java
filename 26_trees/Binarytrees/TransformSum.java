package Binarytrees;

public class TransformSum extends basicTree {
    public static class InnerTransformSum extends BinaryTree {
        
        public static int transform(Node root){
            if (root == null) {
                return 0;
            }


            int leftChildData = transform(root.left);
            int rightChildData = transform(root.right);

            // to provide self data to parent
            int data = root.data;

            // edge cases
            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            //  to transfom the current data
            root.data = newLeft + leftChildData +newRight + rightChildData;
            return data;
        }
        
    }
    public static void main(String[] args) {
        InnerTransformSum tree = new InnerTransformSum();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        // root.right.right = new Node(7);

        tree.preOrder(root);
        tree.transform(root);
        tree.preOrder(root);
    }
}
