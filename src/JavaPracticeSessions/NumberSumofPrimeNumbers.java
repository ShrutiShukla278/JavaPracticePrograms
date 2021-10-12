package JavaPracticeSessions;

import java.util.Scanner;

public class NumberSumofPrimeNumbers {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = reader.nextInt();

		for (int j = 1; j <= num; j++) {
			if (isPrimeNum(j)) {
				int num1 = num - j;
				if (isPrimeNum(num1)) {
					System.out.println(j + " , " + num1);
				} 
			}
		}

	}

	public static boolean isPrimeNum(int n1) {
		boolean result = false;
		if (n1 == 1) {
			return true;
		}
		for (int i = 2; i < n1; i++) {
			if (n1 % i != 0) {
				result = true;

			} else {
				result = false;
				break;

			}
		}

		return result;

	}

}
