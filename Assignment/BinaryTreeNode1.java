public class BinaryTreeNode1<T> {
  T info;
  BinaryTreeNode1<T> lLink;
  BinaryTreeNode1<T> rLink;

  // Constructor to initialize the node with the provided info
  public BinaryTreeNode1(T info) {
      this.info = info;
      lLink = null;  // Left child is initially null
      rLink = null;  // Right child is initially null
  }

  // Main method to test the BinaryTreeNode class
  public static void main(String[] args) {
      // Create nodes of type Integer
      BinaryTreeNode1<Integer> root = new BinaryTreeNode1<>(10);
      BinaryTreeNode1<Integer> leftChild = new BinaryTreeNode1<>(5);
      BinaryTreeNode1<Integer> rightChild = new BinaryTreeNode1<>(15);

      // Set the left and right children of the root
      root.lLink = leftChild;
      root.rLink = rightChild;

      // Print out the tree structure
      System.out.println("Root: " + root.info);
      System.out.println("Left Child: " + root.lLink.info);
      System.out.println("Right Child: " + root.rLink.info);
  }
}
