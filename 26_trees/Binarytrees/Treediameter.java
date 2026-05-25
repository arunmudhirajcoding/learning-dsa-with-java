
public class Treediameter extends basicTree {

    static class BinaryTree2 extends BinaryTree {

        // aproach-1 -- tc: O(n^2) due to on every node of subtree diameter we calculate
        // the height also
        // diameter of a tree is the no. of nodes of the longest path between 2 leaves
        /*
         *      1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * / \ / \
         * 8 9 10 11
         *  / \   / \
         * 12 13 14 15
         * 
         * longest path b/w 12 and 15 is 15-10-6-3-1-2-4-8-12
         * which is 9 nodes. so the diameter is 9
         */
        public int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            // find the left subtree diameter and height
            int ld = diameter(root.left);
            int lh = treeHeight(root.left);

            // find the right subtree diameter and height
            int rd = diameter(root.right);
            int rh = treeHeight(root.right);
            // diameter of a node is the ( height of left subtree and right subtree + 1 )
            int sd = lh + rh + 1;
            return Math.max(Math.max(ld, rd), sd); 
        }

        //Approach-2 O(n) due to diamter and info both at a time
        // diameter + height info :
        static class Info {

            int diam, ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public Info diameter2(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            // find the left subtree diameter and height in the form of info obj
            Info li = diameter2(root.left);

            // find the right subtree diameter and height in the form of info obj
            Info ri = diameter2(root.right);

            //every time we return diameter and height at a time
            int diam = Math.max(Math.max(li.diam, ri.diam), (li.ht + ri.ht + 1));
            int ht = Math.max(li.ht, ri.ht)+1;
            return new Info(diam, ht);
        }
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, 9, -1, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1, -1 };
        // int nodes[] = { 1, 2, 4, 8, 12, -1, -1, 13, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, 14, -1, -1, 15, -1, -1, 11,
        //         -1, -1, 7, -1, -1 };
        int nodes[] = { 1, 2, 4, 8, 12, -1, -1, 13, -1, -1, 9, -1, -1, 5, -1, -1, 3, 6, 10, 14, -1, -1, 15, -1, -1, 11,
                -1, -1, 7, -1, -1 };
        BinaryTree2 tree = new BinaryTree2();
        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(4);
        Node root = tree.buildTree(nodes);
        tree.levelOrder(root);
        System.out.println(tree.diameter(root));
        System.out.println(tree.diameter2(root).diam);

    }
}
