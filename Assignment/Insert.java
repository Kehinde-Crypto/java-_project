public class Insert {
  static class TreeNode {
      int data;
      TreeNode leftChild, rightChild;

      // Constructor to initialize a new node with data
      public TreeNode(int data) {
          this.data = data;
          this.leftChild = null;
          this.rightChild = null;
      }
  }

  TreeNode root;

  // Constructor to initialize the tree
  public Insert() {
      this.root = null;
  }

  // Method to insert data into the binary search tree
  public void insert(int data) {
      TreeNode tempNode = new TreeNode(data);  // Create a new node to insert
      TreeNode current;
      TreeNode parent = null;

      // If tree is empty, create the root node
      if (root == null) {
          root = tempNode;
      } else {
          current = root;

          // Traverse the tree to find the correct insertion point
          while (true) {
              parent = current;

              // Go to the left of the tree
              if (data < current.data) {
                  current = current.leftChild;

                  // Insert to the left if current is null
                  if (current == null) {
                      parent.leftChild = tempNode;
                      return;
                  }
              } else {
                  // Go to the right of the tree
                  current = current.rightChild;

                  // Insert to the right if current is null
                  if (current == null) {
                      parent.rightChild = tempNode;
                      return;
                  }
              }
          }
      }
  }

  // Method to print the tree in-order (for testing purposes)
  public void inOrderTraversal(TreeNode node) {
      if (node != null) {
          inOrderTraversal(node.leftChild);
          System.out.print(node.data + " ");
          inOrderTraversal(node.rightChild);
      }
  }

  // Main method to test the insert function
  public static void main(String[] args) {
      Insert tree = new Insert();

      // Insert data into the tree
      tree.insert(50);
      tree.insert(30);
      tree.insert(20);
      tree.insert(40);
      tree.insert(70);
      tree.insert(60);
      tree.insert(80);

      // Print the tree in-order (should print the numbers in sorted order)
      System.out.print("In-order traversal of the binary search tree: ");
      tree.inOrderTraversal(tree.root);  // Output should be: 20 30 40 50 60 70 80
  }
}

