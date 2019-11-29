package proceduraljava;

public class ComputeAverage {

	public static void main(String[] args) {

		int a[] = { 5, 6, 7, 8, 25, 30 };
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
			sum += a[i];

		}
		
		System.out.print("Elements of Array 'a' are: ");
		for (int i = 0; i <a.length; i++) {
			System.out.print(a[i]+ " ");

		}
		System.out.println();
		
		System.out.println("Sum of Array 'a' "+ sum);
		int average = sum / a.length;
		System.out.println("Avg of Array 'a' " + average);
		System.out.println("-----------");
		
		int b[] = { 30, 40, 50, 60, 70, 80, 90, 100, 110, 120 };
		int sum1 = 0;
		for (int j = 0; j <b.length; j++) {
			sum1 += b[j];

		}
		System.out.print("Elements of Array 'b' are: ");
		for (int i = 0; i <b.length; i++) {
			System.out.print(b[i]+ " ");

		}
		System.out.println();
		System.out.println("Sum of Array 'b' " + sum1);
		int average1 = sum1 / b.length;
		System.out.println("Avg of Array 'b' " +average1);
	}
}
