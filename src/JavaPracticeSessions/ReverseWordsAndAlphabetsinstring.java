package JavaPracticeSessions;

public class ReverseWordsAndAlphabetsinstring {

	public static void main(String[] args) {
		String str = "Java is good";

		String arr[] = str.split(" ");
		String revWord = "";
		String revStr = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			String word = arr[i];
			revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord = revWord + word.charAt(j);
			}
			revStr = revStr + " " + revWord;

		}

		System.out.print(revStr);
	}

}
