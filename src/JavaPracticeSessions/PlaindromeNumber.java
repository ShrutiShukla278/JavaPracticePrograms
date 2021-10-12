package JavaPracticeSessions;

import java.util.Scanner;

public class PlaindromeNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");

		int num1 = reader.nextInt();
		int num = num1;

		int result = 0;

		while (num != 0) {
			int temp = num % 10;
			result = result * 10 + temp;
			num = num / 10;
		}
		
		System.out.print("The result is" + result);

		if (result == num1) {
			System.out.print("The number is Palindrome");
		} else {
			System.out.print("The number is not a Palindrome");
		}

		reader.close();

	}

}
