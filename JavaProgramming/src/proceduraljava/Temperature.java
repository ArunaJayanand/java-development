
package proceduraljava;

import java.util.Scanner;

/**
 * 
 * This class is to convert temperature in celcius to farenheit and categorize
 * the wrather as COLD WAETHER, PRETTY WARM or NORMAL.
 * 
 * @author Aruna
 *
 */
class Temperature {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celcious: ");
		float tempCel = sc.nextFloat();
		sc.close();
		float tempInFaren = tempCel * (9f / 5) + 32;
		System.out.println("Temperature in farenheit is :" + tempInFaren);

		// Categorizing the temperature
		if (tempInFaren < 45) {
			System.out.println("COLD WEATHER");
		} else if (tempInFaren > 80) {
			System.out.println("PRETTY WARM");
		} else {
			System.out.println("NORMAL WEATHER");
		}
	}

}
