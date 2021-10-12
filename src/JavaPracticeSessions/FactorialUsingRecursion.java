package JavaPracticeSessions;

import java.util.Scanner;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		System.out.print(fact(num));

	}

	public static int fact(int i) {
		int result = 1;
		if (i != 0) {
			result = i * fact(i - 1);
		}
		return result;
	}

}
