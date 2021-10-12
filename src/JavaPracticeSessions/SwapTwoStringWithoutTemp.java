package JavaPracticeSessions;

public class SwapTwoStringWithoutTemp {

	public static void main(String[] args) {
		String str1= "hello";
		String str2= "world";
		
		System.out.println("Before swap: "+ str1 +" "+ str2);
		
		str1= str1+str2;
		str2= str1.substring(0, str1.length()- str2.length());
		str1= str1.substring(str1.length()- str2.length());
		
		System.out.println("After swap: "+ str1 +" "+ str2);
		

	}

}
