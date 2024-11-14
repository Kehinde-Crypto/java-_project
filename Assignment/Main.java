class Node {
  int data;  // The data stored in the node
  Node leftChild;  // Reference to the left child node
  Node rightChild;  // Reference to the right child node

  // Constructor to initialize the node with data
  public Node(int data) {
      this.data = data;
      this.leftChild = null;
      this.rightChild = null;
  }
}

public class Main {
  public static void main(String[] args) {
      // Create a new node with value 10
      Node root = new Node(10);

      // Create and attach left and right children to the root node
      root.leftChild = new Node(5);
      root.rightChild = new Node(15);

      // Print the data of the root node and its children
      System.out.println("Root data: " + root.data);  // Should print 10
      System.out.println("Left child data: " + root.leftChild.data);  // Should print 5
      System.out.println("Right child data: " + root.rightChild.data);  // Should print 15
  }
}
