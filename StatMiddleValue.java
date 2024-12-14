/*
 * Name: Nang Nu Nu Aye
 * ID: 6643005
 * Sec: 545
 */
package classEx3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class StatMiddleValue {


 public static void main(String[] args) {
  double[] numbers = new double[100];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextDouble() * 100;
        }

        System.out.printf("Mean: %.2f" , mean(numbers));
        System.out.printf("\nMode: %.2f" ,mode(numbers));
        System.out.printf("\nMedian: %.2f" , median(numbers));

 }
 public static double mean(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
 }
 public static double mode(double[] arr) {
	 Map<Double, Integer> frequencyMap = new 
 HashMap<>();
     for (double v : arr) {
       frequencyMap.put(v, frequencyMap.getOrDefault(v, 0) + 1);
        }

      double mode = arr[0];
      int maxCount = 0;

      for (Map.Entry<Double, Integer> entry : 
 frequencyMap.entrySet()) {
         if (entry.getValue() > maxCount) {
            maxCount = entry.getValue();
            mode = entry.getKey();
         }
        }

        return mode;
    }
 public static double median(double[] arr) {
    Arrays.sort(arr);
    int n = arr.length;
    if (n % 2 == 0) {
      return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
   } else {
     return arr[n / 2];
    }
  }
}

