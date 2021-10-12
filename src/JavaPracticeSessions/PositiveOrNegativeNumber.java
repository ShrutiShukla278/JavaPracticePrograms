package JavaPracticeSessions;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the number: ");

		int i = reader.nextInt();

		if (i < 0) {
			System.out.print("The number is negative");
		} else {
			System.out.print("The number is positive");
		}

	}

}
