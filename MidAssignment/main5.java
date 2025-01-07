// This program has an  2D array that store values of 10 each in each stack 
// Using the nested for loop to itertae due to dynacy of the array flow 
// Then we used the  for each method to be able to get the values and the rows
import java.util.Scanner;
public class main5 {
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 int[][]values = new int[10][10];
  for(int i = 0; i < 10; i++){
     for(int j=0; j < 10; j++){
      System.out.println("Enter the values [" + i +"]["+ j + "] ");
      values[i][j] = scanner.nextInt();
     }
     for(int []rows:values){
      for(int colunm:rows){
        System.out.println(values + " ");
      }
     }
     scanner.close();
  }
  }
}
