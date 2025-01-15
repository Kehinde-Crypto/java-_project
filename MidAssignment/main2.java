public class main2 {
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 12; j++) {
        if (j < 4 || j >= 9) {
          System.out.print("G");
        } else {
          System.out.print("W");
        }
      }
      System.out.println();
    }
  }
}
