// public class main3 {
//   public static void main(String[] args) {
//     int[]mean = new int[10];
//     int N, pop_mean, x median;
//      N = mean  / mean.length;
//      if (pop_mean == 0) {

//      }

//      }

//       }

//   }

import java.util.Arrays;

public class main3 {
  public static void main(String[] args) {
    int[] num = { 2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12 };

    double Sum = 0;
    for (int i : num) {
      Sum += i;
    }

    double Mean = (Sum / num.length);

    System.out.println("" + Mean);

    Arrays.sort(num);

    int Median;
    if (num.length % 2 == 0) {
      Median = (num[num.length - 1] / num[num.length]) / 2;
    } else {
      Median = (num[num.length / 2]);
    }
    System.out.println("" + Median);
  }
}