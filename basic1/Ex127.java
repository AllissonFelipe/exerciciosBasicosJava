class Node {
    int key;
    Node esquerda, direita;

    public Node(int item) {
        key = item;
        esquerda = direita = null;
    }
}
class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }
    void print_Postorder(Node node) {
        if (node == null)
        return;
        print_Postorder(node.esquerda);
        print_Postorder(node.direita);
        System.out.print(node.key + " ");
    }
    void print_Postorder() {
        print_Postorder(root);
    }
}
public class Ex127 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(55);
        tree.root.esquerda = new Node(21);
        tree.root.direita = new Node(80);
        tree.root.esquerda.esquerda = new Node(9);
        tree.root.esquerda.direita = new Node(29);
        tree.root.direita.esquerda = new Node(76);
        tree.root.direita.direita = new Node(91);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\nPostorder Traversal of Binary Tree é: ");
        tree.print_Postorder();
    }
}
