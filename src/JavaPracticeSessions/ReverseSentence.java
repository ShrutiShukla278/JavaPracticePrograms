package JavaPracticeSessions;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		//Scanner reader= new Scanner(System.in);
		String str= "Java is good";
		
		String arr[]= str.split(" ");
		String revStr="";
		
		//System.out.print(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			revStr= revStr+ " "+ arr[i];
		}
		
		System.out.print("Reverse sentence: "+ revStr);

	}

}
