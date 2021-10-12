package JavaPracticeSessions;

import java.util.Scanner;

public class RemoveJunkCharacterFromString {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the string:");
		String str = reader.next();
		String noJunkStr = "";

		// System.out.print(str);

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				noJunkStr = noJunkStr + str.charAt(i);
			}
		}
		System.out.print(noJunkStr);
	}

}
