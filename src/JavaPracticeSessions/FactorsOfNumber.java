package JavaPracticeSessions;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = reader.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		reader.close();

	}

}
