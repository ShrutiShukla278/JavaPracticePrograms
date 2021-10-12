package JavaPracticeSessions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");

		int num = reader.nextInt();
		int factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

		System.out.print("The factorial is: " + factorial);

		reader.close();

	}

}
