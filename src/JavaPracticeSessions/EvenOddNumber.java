package JavaPracticeSessions;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number:");

		int num = reader.nextInt();

		if (num == 1) {
			System.out.print("The number is odd");
		} else if (num > 0) {
			if (num % 2 == 0) {
				System.out.print("The number is even");
			} else {
				System.out.print("The number is odd");
			}
		}

		reader.close();

	}

}
