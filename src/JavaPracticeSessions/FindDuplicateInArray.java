package JavaPracticeSessions;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class FindDuplicateInArray {

	public static void main(String[] args) {

		// integer array using loop
		int arr[] = { 2, 3, 4, 5, 7, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print("duplicate is " + arr[i]);
				}
			}
		}

		// String array using hashmap

		String str[] = { "Selenium", "Java", "Shruti", "Hello", "Java", "Selenium", "Selenium"};

		HashMap<String, Integer> map = new HashMap<>();

		for (String element : str) {
			Integer count = map.get(element);
			if (count == null) {
				map.put(element, 1);
			} else {
				map.put(element, count + 1);
			}
		}
		
		//System.out.print(map);
		
		//iterate over map to print
		
		for(String word:map.keySet()) {
			if(map.get(word)>1) {
				System.out.println(word+ "-"+ map.get(word));
			}
		}

	}

}
