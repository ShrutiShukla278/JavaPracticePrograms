package JavaPracticeSessions;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter starting num ");
		int num1 = reader.nextInt();

		System.out.print("Enter ending num ");
		int num2 = reader.nextInt();

		// 3, 8
		// i=3, j=1

		for (int j = 2; j < num2; j++) {
			if (num2 % j != 0) {
				if (j >= num1) {
					System.out.println(j);
				}
			}
		}

		reader.close();

	}

}
