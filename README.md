the assignment for question one
write a java program to print out the flag of nigeria as shown  in this slide 
# use a single loop 
# use a nested loop

to be able to use the loop you will need to able to have the width and height of the flag to be able to do it effectively.
so we will have a unit loop or a single loop then a loop again inside the loop (NESTED LOOP)
public class main{
  public static void main(String[] args){
    for(int i = 0;i<=4;i++){
      System.out.print( "/n" + "* * * *  =  =  =  =   * * * * *" );
    }
    for(int j = 0; j <= 5; j++){
       System.out.print( "/n" + "* * * *  =  =  =  =   * * * * *" );
   }
  }
}
Question two explanation
write a java program to print out the flag of nigeria as shown in the slide (Ignore the background white background ).To do this,
A. Use a single loop
B. Use a nested loop
the main2 is  the second question 
so the second question explanation is done in this manner.
so we are going to  using a for loop to be able to get the lenght and the height of the flog by using from dimension of 9 by 27 but the range is from the beginning of  the value "j"  at the range of 27
from 9 to 27
the first loop handles from index 0 to 8
second loop handles form index 0 to 26
so the conditional which is the if statement says that  using the inner loop variable that is j from range 9 to 18 it will give us this remaining value.
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

Question 3
using the array of number get the mean and the median of the values and be able to get the standard deviation of the array given below
mean = sum total of the values /   count number of values in the array


Question 4:
write a program using a loop to assign elements to the array by accepting  input from the user.
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
      // using a for each method in java is for(type variable of any name : variable name of the array)
      for(int values: arr){
        System.out.println(value);

      }
      scanner.close();
  }
}

So this is code works in such a way that the user should be able to work out the arrays by his self we are going to import the Scanner library form the java.util
Then we are going to create our variable in this format = int[]value = new int[5];
the we create a loop from index of 0 to 10 that you will notice we have arr.length that indicates that we should have the values of its index places like that

# the for each statement of writing the code we should be able to write it in this format for(int value: numbers)
the left hand side of the for each statement is done in this manner that we should have 
the for(data type (int , char , bool etc...) any name : array name){
  // your code
} 
For the number 5 question is just like the number for question you just add the make it dynamic or 2D array


