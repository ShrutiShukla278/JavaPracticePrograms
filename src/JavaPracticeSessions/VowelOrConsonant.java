package JavaPracticeSessions;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter alphabet:");

		char c = reader.next().charAt(0);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("The alphabet is Vowel");
		} else {
			System.out.println("The alphabet is Consonant");
		}
		
		reader.close();
	}

}
