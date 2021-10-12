package JavaPracticeSessions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int largest = 0;
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(78);
		arr.add(45);
		arr.add(786);

		for (int i = 1; i < arr.size(); i++) {
			int temp = arr.get(i - 1);// 11, 8
			int temp1 = arr.get(i);// 8, 54
			if (temp > temp1) {
				largest = temp;// 11
			} else {
				largest = temp1;// 54
			}
		}
		System.out.print("The largest number is:" + largest);

	}

}
