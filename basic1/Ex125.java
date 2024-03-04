class Node {
    int chave;
    Node esquerda, direita;

    public Node(int item) {
        chave = item;
        esquerda = direita = null;
    }
}

class BinaryTree {
    Node root;
    
    BinaryTree() {
        root = null;
    }
    void print_Preorder(Node node) {
        if (node == null) 
        return;

        System.out.print(node.chave + " ");

        print_Preorder(node.esquerda);

        print_Preorder(node.direita);

    }
    void print_Preorder() {
        print_Preorder(root);
    }
}

public class Ex125 {
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
        System.out.println("Preorder traversal of Binary Tree é: ");
        tree.print_Preorder();
    }
}
