public class main2 {
  public static void main(String[] args) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 27; j++) {
        if (j < 9 || j >= 18) {
          System.out.print("G" );
        } else {
          System.out.print("W" );
        }
      }
      System.out.println();
    }
  }
}
