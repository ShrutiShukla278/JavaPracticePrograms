package JavaPracticeSessions;

import java.util.ArrayList;

public class HeadTailProblem {

	public static void main(String[] args) {
		int[] originalar = { 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1 };
		ArrayList<Integer> arwithZero = new ArrayList<Integer>();

		ArrayList<Integer> arwithOne = new ArrayList<Integer>();

		int size = originalar.length;
		System.out.println(size);
		for (int i = 0; i < size; i++) {
			arwithZero.add(i, 0);
			if (i < size) {
				arwithZero.add(i + 1, 1);
				i = i + 1;
			}

//			System.out.println(i);
//			System.out.println(arwithZero);
		}

		for (int i = 0; i < size; i++) {
			arwithOne.add(i, 1);
			if (i < size) {
				arwithOne.add(i + 1, 0);
				i = i + 1;
			}

//			System.out.println(i);
//			System.out.println(arwithZero);
		}

		int count = 0;
		int count1 = 0;
		for (int j = 0; j < size; j++) {
			if (originalar[j] != arwithZero.get(j)) {
				count++;
			}
			if (originalar[j] != arwithOne.get(j)) {
				count1++;
			}
		}

		System.out.println(count);
		System.out.println(count1);

	}

}
