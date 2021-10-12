package JavaPracticeSessions;

import java.util.Scanner;

public class MakeCalculator {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the 1st number:");
		int n1 = reader.nextInt();
		System.out.print("enter 2nd number:");
		int n2 = reader.nextInt();
		System.out.print("enter the operation:");
		String op = reader.next();

		switch (op) {
		case "add":
			System.out.print(n1 + n2);
			break;

		case "sub":
			if (n1 > n2) {
				System.out.print(n1 - n2);
			} else {
				System.out.print(n2 - n1);
			}

			break;
		case "mul":
			System.out.print(n1 * n2);
			break;

		case "div":
			if (n2 > 0)
				System.out.print(n1 / n2);
			break;
		}
		reader.close();
	}

}
