package JavaPracticeSessions;

import java.util.Scanner;

public class FindQuotientAndRemainder {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Divident:");
		int n1 = reader.nextInt();

		System.out.println("Enter the Divisor:");
		int n2 = reader.nextInt();

		if (n2 != 0) {
			System.out.println("The quotient is: " + n1 / n2);
			System.out.println("The remainder is: " + n1 % n2);
		} else {
			System.out.print("Enter valid numbers");
		}

	}
}
