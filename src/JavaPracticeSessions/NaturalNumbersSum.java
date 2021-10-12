package JavaPracticeSessions;

import java.util.Scanner;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();

		int sum = 0;

		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}

		System.out.print("The sum of natural numbers till " + num + " is " + sum);

		reader.close();

	}

}
