/*Name- Nang Nu Nu Aye
 * Id-6643005
 * Section-545
 */
package Worksheet_8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RealNumberList {
	
	 public static double getAverage(ArrayList<Double> list) {
	        double sum = 0;
	        for (double num : list) {
	            sum += num;
	        }
	        return sum / list.size(); 
	    }
	

	public static void main(String[] args) {
		//Input
		Scanner sc= new Scanner(System.in);
		ArrayList<Double>numbers= new ArrayList<>();
		
		System.out.println("Enter the number of elements: ");
		int N= sc.nextInt();
		
		for(int i=0;i<N;i++) {
			System.out.print("Enter numbers: "+(i+1)+": ");
			numbers.add(sc.nextDouble());
		}
		Collections.sort(numbers);
		System.out.println("\nSorted List: " + numbers);
		System.out.println("Average: "+getAverage(numbers));
		
		
		sc.close();

	}

}
