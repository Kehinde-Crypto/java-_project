public class BinaryTreeNode2<T> {
  T info;
  BinaryTreeNode2<T> lLink;
  BinaryTreeNode2<T> rLink;

  // Constructor to initialize the node with the provided info
  public BinaryTreeNode2(T info) {
      this.info = info;
      lLink = null;  // Left child is initially null
      rLink = null;  // Right child is initially null
  }

  // Recursive method to compute the height of the binary tree
  public static <T> int height(BinaryTreeNode2<T> p) {
      // If the node is null, the height is 0 (base case)
      if (p == null) {
          return 0;
      } else {
          // Otherwise, the height is 1 + the maximum of the heights of the left and right subtrees
          return 1 + Math.max(height(p.lLink), height(p.rLink));
      }
  }

  // Main method to test the BinaryTreeNode class and height function
  public static void main(String[] args) {
      // Create nodes of type Integer
      BinaryTreeNode2<Integer> root = new BinaryTreeNode2<>(10);
      BinaryTreeNode2<Integer> leftChild = new BinaryTreeNode2<>(5);
      BinaryTreeNode2<Integer> rightChild = new BinaryTreeNode2<>(15);
      BinaryTreeNode2<Integer> leftLeftChild = new BinaryTreeNode2<>(3);

      // Set the left and right children of the root
      root.lLink = leftChild;
      root.rLink = rightChild;

      // Set the left child of the left child (to create a deeper tree)
      leftChild.lLink = leftLeftChild;

      // Calculate and print the height of the binary tree
      System.out.println("Height of the binary tree: " + height(root));
  }
}

