package oop.classandobjects;

import java.util.Scanner;

public class DateDemo {

	public static void displayDate(Date dob) {
		System.out.println("Birthday is " + dob.month + "/" + dob.day + "/" + dob.year);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day :");
		int d = sc.nextInt();
		System.out.println("Enter month :");
		int m = sc.nextInt();
		System.out.println("Enter year :");
		int y = sc.nextInt();
		sc.close();

		Date dob = new Date(d,m,y);
		displayDate(dob);	
		
		Date dob1 = new Date(29,2,2015);
		displayDate(dob1);

	}
}
