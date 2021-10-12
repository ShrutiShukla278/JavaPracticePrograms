package JavaPracticeSessions;

public class FindMissingNumberinArray {

	public static void main(String[] args) {
		int arr[] = {4,5,7,8,9,10};
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] +1  != arr[i]) {
				 System.out.print(arr[i-1]+1);
			 }
		}

	}

}
