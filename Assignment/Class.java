public class Class<T> {
  T info;
  Class<T> lLink;
  Class<T> rLink;
  public Class leftchild;
  public Class rightchild;
  public String data;
  public Object root;

  public Class(T info) {
    this.info = info;
    lLink = null;
    rLink = null;
  }

  public static <T> void copyTree(Class<T> copiedTreeRoot, Class<T> otherTreeRoot) {
    if (otherTreeRoot == null) {
      copiedTreeRoot = null;
    } else {
      Class<T> newNode = new Class<T>(otherTreeRoot.info);
      // copiedTreeRoot.info = newNode.info;
      copiedTreeRoot.lLink = new Class<T>(null);
      copiedTreeRoot.rLink = new Class<T>(null);
      copyTree(copiedTreeRoot.lLink, otherTreeRoot.lLink);
      copyTree(copiedTreeRoot.rLink, otherTreeRoot.rLink);
    }
  }

  public static void main(String[] args) {
    Class<Integer> originalRoot = new Class<>(10);
    Class<Integer> leftChild = new Class<>(12);
    Class<Integer> rightChild = new Class<>(14);
    originalRoot.lLink = leftChild;
    originalRoot.rLink = rightChild;
    Class<Integer> copiedRoot = new Class<>(0);
    copyTree(copiedRoot, originalRoot);
    System.out.println("Original Tree Root: " + originalRoot.info);
    System.out.println("Copied Tree Root: " + copiedRoot.info);
    System.out.println("Left child of original tree: " + originalRoot.lLink.info);
    System.out.println("Left child of copied tree: " + copiedRoot.lLink.info);
  }
}

