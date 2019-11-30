package proceduraljava;

import java.util.Scanner;

public class Calculator {

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum is: " + sum);
	}

	public static void sub(int a, int b) {
		int diff = a - b;
		System.out.println("Diff is: " + diff);
	}

	public static void mul(int a, int b) {
		int mul = a + b;
		System.out.println("multi val  is: " + mul);
	}

	public static void div(int a, int b) {
		int div = a + b;
		System.out.println("quotient is: " + div);
	}

	public static void mod(int a, int b) {
		int mod = a % b;
		System.out.println("mod is: " + mod);
	}

	public static void main(String[] args) {

		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		System.out.println("Enterthe secont number: ");
		num2 = sc.nextInt();
		System.out.println(
				"Enter the operation :\n '+' for 'Addition' \n '-' for 'Subtraction':\n '*' for 'Multiplication'\n '/' for 'Division'\n'%' for 'Modulus'");
		char ch = sc.next().charAt(0);
		sc.close();

		switch (ch) {
		case '+':
			add(num1, num2);
			break;
		case '-':
			sub(num1, num2);
			break;
		case '*':
			mul(num1, num2);
			break;
		case '/':
			div(num1, num2);
			break;
		case '%':
			mod(num1, num2);
			break;
		default:
			System.out.println("Invalid Operation");

		}
	}
}
