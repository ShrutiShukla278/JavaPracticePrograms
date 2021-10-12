package JavaPracticeSessions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		int val1 = 0;
		int val2 = 1;

		for (int i = 0; i <= num; i++) {
			System.out.print(val1);
			int sum = val1 + val2;
			val1 = val2;
			val2 = sum;
		}

		reader.close();
	}

}
