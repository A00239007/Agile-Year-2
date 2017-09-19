import java.util.Scanner;

public class StringDecoder {

	public static void main(String[] args) {
		StringDecoder stringdecoder = new StringDecoder();
		String word = stringdecoder.readString("Enter a word");
		System.out.println("The number of vowels: "+stringdecoder.getVowels(word));
		System.out.println("Lenght of the word : " + stringdecoder.getLength(word));
        stringdecoder.printLetters(word);
	}

	public String readString(String word) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(word);
		String input = in.next();
		return input;
	}

	public boolean validateInput(String word) {

		for (char c : word.toCharArray()) {
			if (Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public int getLength(String word) {
		return word.length();
	}

	public int getVowels(String word) {
		int count = 0;

        word = word.toLowerCase();

        for (char c : word.toCharArray())
        {
            if (c =='a' || c =='e' || c =='i' || c =='o' || c =='u')
            {
                count++;
            }
        }
        return count;

	}

	public void printLetters(String word) {
		int length = word.length();

		System.out.println("First letter is : " + word.charAt(0));
		System.out.println("Last letter is : " + word.charAt(length - 1));
	}
}