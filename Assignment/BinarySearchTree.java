class Node {
    int data; // Data stored in the node
    Node leftChild; // Left child reference
    Node rightChild; // Right child reference

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}

public class BinarySearchTree {
    private Node root; // Root of the tree

    // Constructor to initialize the tree
    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node in the tree
    public void insert(int data) {
        Node tempNode = new Node(data); // Create a new node with the given data
        Node current; // Pointer to traverse the tree
        Node parent; // Pointer to keep track of the parent node

        // If the tree is empty, make the new node the root
        if (root == null) {
            root = tempNode;
        } else {
            current = root; // Start traversal from the root
            parent = null; // Initialize parent to null

            while (true) { // Traverse the tree to find the correct position
                parent = current; // Set parent to the current node

                // If data is smaller, move to the left subtree
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) { // If left child is null, insert here
                        parent.leftChild = tempNode;
                        return; // Exit after insertion
                    }
                }
                // If data is greater or equal, move to the right subtree
                else {
                    current = current.rightChild;
                    if (current == null) { // If right child is null, insert here
                        parent.rightChild = tempNode;
                        return; // Exit after insertion
                    }
                }
            }
        }
    }

    // Main method to test the insert functionality
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert values into the binary search tree
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(19);
        tree.insert(31);
        tree.insert(42);

        // Display the tree (For simplicity, we'll just print the root data)
        System.out.println("Root node: " + tree.root.data); // Should print 27
    }
}
