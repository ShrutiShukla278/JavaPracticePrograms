package JavaPracticeSessions;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();

		int rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.print("Reversed number: " + rev);

		reader.close();

	}

}
