package JavaPracticeSessions;

import java.util.Scanner;

public class CheckAlphabetOrNot {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter the character: ");

		char i = reader.next().charAt(0);

		if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
			System.out.print("The character is alphabet");
		} else {
			System.out.print("The character is not an alphabet");
		}

		reader.close();
	}

}
