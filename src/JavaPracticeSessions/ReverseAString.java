package JavaPracticeSessions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = reader.next();

		String revStr = "";

		for (int i = str.length(); i >0; i--) {
			revStr = revStr + str.charAt(i-1);
		}

		System.out.print(revStr);

	}

}
