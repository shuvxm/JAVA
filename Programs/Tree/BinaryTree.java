package Tree;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}


public class BinaryTree {
    private Node root;

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = insertRec(current.left, data);
        } else if (data > current.data) {
            current.right = insertRec(current.right, data);
        }

        // If data is equal, we can choose to ignore or handle duplicates
        return current;
    }

    // Optional: Print the tree in inorder (sorted)
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node current) {
        if (current != null) {
            inorderRec(current.left);
            System.out.print(current.data + " ");
            inorderRec(current.right);
        }
    }
}
