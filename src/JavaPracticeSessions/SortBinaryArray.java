package JavaPracticeSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortBinaryArray {

	public static void main(String[] args) {
		int arr[]= {0,1,0,0,0,1,1,0,1,1};
		
		ArrayList<Integer> arrList= new ArrayList<>();
		for(int i=0; i< arr.length; i++) {
			arrList.add(arr[i]);
		}
		  Collections.sort(arrList);
		
		//System.out.print(arrList);
		
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));

	}

}
