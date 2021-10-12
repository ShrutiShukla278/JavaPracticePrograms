package JavaPracticeSessions;

import java.util.Scanner;

public class GenerateMultiplicationTable {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();

		for (int i = 1; i <= 10; i++) {
			int val = num * i;
			System.out.println(num + " X "+ i + " = "+ val );
		}
		reader.close();
	}

}
