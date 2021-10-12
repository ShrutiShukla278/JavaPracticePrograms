package JavaPracticeSessions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter year:");

		int year = reader.nextInt();

		if (year % 4 == 0) {
			System.out.print("The year is leap year");
		} else {
			System.out.print("The year is not a leap year");
		}

		reader.close();

	}

}
