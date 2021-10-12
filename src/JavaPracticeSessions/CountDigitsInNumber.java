package JavaPracticeSessions;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("enter the number:");
		int num = reader.nextInt();

		int count = 0;

		while (num!=0) {
			num= num/10;
			count++;
		}

		System.out.print(count);

		reader.close();

	}

}
