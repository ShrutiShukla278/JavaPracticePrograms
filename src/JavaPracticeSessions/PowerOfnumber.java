package JavaPracticeSessions;

import java.util.Scanner;

public class PowerOfnumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();

		System.out.print("enter the power:");

		int power = reader.nextInt();

		int result = 1;
		// 2= 4
		for (int i = 0; i < power; i++) {
			result = num * result;
		}

		System.out.print("The power is: " + result);
		reader.close();

	}

}
