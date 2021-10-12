package JavaPracticeSessions;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1 = reader.nextInt();
		System.out.println("Enter 2nd number:");
		int num2 = reader.nextInt();

		System.out.println("Before swapping " + num1 + "," + num2);

	//	int temp = num1;
		//num1 = num2;
		//num2 = temp;
		
				
		num1= num1+num2;
		num2= num1-num2;
		num1= num1-num2;
		

		System.out.println("After swapping " + num1 + "," + num2);

	}

}
