package JavaPracticeSessions;

import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Character: ");

		char c = reader.next().charAt(0);
		int result = (int) c;

		System.out.print("The Ascii Value is:" + result);

		reader.close();

	}
}
