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
    int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // Calculate mean
    double mean = calculateMean(num);
    System.out.println("Mean: " + mean);

    // Calculate median
    double median = calculateMedian(num);
    System.out.println("Median: " + median);

    // Calculate standard deviation
    double stdDev = calculateStandardDeviation(num, mean);
    System.out.println("Standard Deviation: " + stdDev);
  }

  public static double calculateMean(int[] num) {
    double sum = 0;
    for (int n : num) {
      sum += n;
    }
    return sum / num.length;
  }

  public static double calculateMedian(int[] num) {
    Arrays.sort(num);
    if (num.length % 2 == 0) {
      return (num[num.length / 2 - 1] + num[num.length / 2]) / 2.0;
    } else {
      return num[num.length / 2];
    }
  }

  public static double calculateStandardDeviation(int[] num, double mean) {
    double sum = 0;
    for (int n : num) {
      sum += Math.pow(n - mean, 2);
    }
    double variance = sum / num.length;
    return Math.sqrt(variance);
  }
}