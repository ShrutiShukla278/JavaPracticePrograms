package JavaPracticeSessions;

import java.util.Scanner;

public class NaturalNumberSumUsingRecursion {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = reader.nextInt();
		System.out.print(addNum(num));

	}

	public static int addNum(int i) {
		int result=0;
		if(i!=0) {
			 result = i + addNum(i - 1);
		}
		return result;
	}

}
