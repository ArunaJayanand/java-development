
package proceduraljava;

import java.math.BigDecimal;

/**
 * 
 * This extracts repeating codes to corresponding methods. It is an imporved
 * version of ComputeAverage.java
 * 
 * @author ARUNA JAYANAND
 *
 */

public class MethodOverloading {

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
	
	public static void computeAverage(int[] array) {
		int sum = 0;
		for (int k = 0; k < array.length; k++) {
			sum += array[k];
		}
		System.out.println("Sum of Array: " + sum);
		int average = sum / array.length;
		System.out.println("Avg of Array: " + average);
	}
	
	/**
	 * This method can be defined as an overloaded version of computeAverage. Please see below
	 * @param array
	 * @param startIndex
	 */
	/*public static void computePartialAverage(int[] array, int startIndex) {
		int sum = 0;
		for (int i = startIndex; i < array.length; i++) {
			sum += array[i];
		}

		double result = (double) sum / (array.length - startIndex);
		BigDecimal avg = new BigDecimal(String.format("%.2f", result));

		System.out.println("Partial Avg of elements strating from index "+ startIndex + " is: "+avg.doubleValue());

	}*/
	
	public static void computeAverage(int[] array, int startIndex) {
		int sum = 0;
		for (int i = startIndex; i < array.length; i++) {
			sum += array[i];
		}

		double result = (double) sum / (array.length - startIndex);
		BigDecimal avg = new BigDecimal(String.format("%.2f", result));

		System.out.println("Partial Avg of elements strating from index "+ startIndex + " is: "+avg.doubleValue());

	}
	
	
	
	
	
	public static void main(String[] args) {

		int a[] = { 5, 6, 7, 8, 10, 20 };
		System.out.print("Elements of Array 'a' are: ");
		printArray(a);
		System.out.println();
		computeAverage(a);

		//computePartialAverage(a, 3);
		computeAverage(a, 3);

	}
}
