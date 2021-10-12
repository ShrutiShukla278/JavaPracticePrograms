package JavaPracticeSessions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		boolean result = true;

		if (num == 1) {
			System.out.print("True");
		} else if (num == 2) {
			System.out.print("True");
		} else if (num > 0) {

			for (int i = 2; i < num; i++) {
				if (num % i != 0) {
					result = true;

				} else {
					result = false;
					break;
				}
			}
		}

		System.out.print(result);
		reader.close();
	}

}
