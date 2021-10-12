package JavaPracticeSessions;

import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number");
		int num1 = reader.nextInt();
		int num = num1;
		double sum = 0;

		// ArrayList<Integer> digits = new ArrayList<>();

		while (num != 0) {
			int n = num % 10;
			sum = sum + Math.pow(n, 3);
			num = num / 10;

		}

		
		if (sum == num1) {
			System.out.print("The number is armstrong number");
		} else {
			System.out.print("The number is not armstrong number");
		}

		reader.close();
	}

}
