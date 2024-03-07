public class Ex130 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.findDepth();
    }
}
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
class BinaryTree {
    Node root;
    int ctr = 0;

    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

    void findDepth() {
        findDepth(root);
        double depth = (Math.log(ctr)/Math.log(2)) + 1;
        System.out.println("A maior profundidade da arvore binaria é: "+Integer.valueOf((int) depth));
    }
    public int findDepth(Node root) {
        if (root == null) {
            return -1;
        } else {
            findDepth(root.left);
            findDepth(root.right);
            ctr++;
        }
        return ctr;
    }
}
