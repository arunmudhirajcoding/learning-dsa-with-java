// package Binarytrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView extends basicTree {
    static class InnerTopView extends BinaryTree {
        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info(root, 0));//initial root always hortizontal distance is 0
            q.add(null);
            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {//for root or last node(level order traversal)
                    if (q.isEmpty()){//last node
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {//if key not present then put into the map
                        map.put(curr.hd, curr.node);
                    }

                    //calculating left node horizontal distance
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }

                    //calculating right node horizontal distance
                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }

            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        InnerTopView tree = new InnerTopView();
        //   1(0) (node with horizontal distance(number line))
        //  / \
    // (-1)2   3(1)
        //  \
        //   4(0)
        //    \
        //     5(1)
        //      \
        //       6(2)
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        InnerTopView.preOrder(root);

    }
}
