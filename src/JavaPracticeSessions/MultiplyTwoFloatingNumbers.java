package JavaPracticeSessions;

import java.util.Scanner;

public class MultiplyTwoFloatingNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 1st num: ");
		float n1 = reader.nextFloat();
		System.out.println("Enter 2nd num: ");
		float n2 = reader.nextFloat();
		float res = multiply(n1, n2);

		System.out.print("The multiplication is " + res);

	}

	public static float multiply(float num1, float num2) {
		float result = num1 * num2;
		return result;
	}
}
