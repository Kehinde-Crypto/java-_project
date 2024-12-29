import java.util.Scanner;
public class main4 {
  public static void main(String[]args){
   
    Scanner scanner = new Scanner(System.in);
    int[] arr = new int[10];
    
     for(int i = 0; i < arr.length; i++){
      System.out.println("Enter your value" + " = " + i);
      arr[i] = scanner.nextInt();
     }
     System.out.println("Enter your value");
      // using a for each method in java is for(type variable : variable name)
      for(int values: arr){
        System.out.println(values);

      }
      scanner.close();
  }
}
