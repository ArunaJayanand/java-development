package proceduraljava;

/**
 * 
 * This extracts repeating codes to corresponding methods. It is an imporved version of 
 * ComputeAverage.java
 * 
 * @author ARUNA JAYANAND
 *
 */

public class BetterComputeAverage {

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}
	
	
	public static void computeAverage(int[] array){
		int sum=0;
		for(int k=0;k<array.length;k++) {
			sum += array[k];
		}
		System.out.println("Sum of Array: "+ sum);
		int average = sum / array.length;
		System.out.println("Avg of Array: " + average);
	}
	
	public static void main(String[] args) {

		int a[] = { 5, 6, 7, 8, 25, 30 };
		System.out.print("Elements of Array 'a' are: ");
		printArray(a);
		System.out.println();
		computeAverage(a);
		
		System.out.println("-----------");
		
		int b[] = { 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		int sum1 = 0;
		for (int j = 0; j <b.length; j++) {
			sum1 += b[j];

		}
		System.out.print("Elements of Array 'b' are: ");
		printArray(b);
		System.out.println();
		computeAverage(b);
	}
}

	


