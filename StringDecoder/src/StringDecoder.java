import java.util.Scanner;
public class StringDecoder {
	//main method(Call for other methods & validation for number)
	public static void main(String [] args) throws Exception{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.next();
		if(word.endsWith(String.valueOf(word.charAt(0))))
		{
			System.out.println("The word has "+getLength(word)+" letters.");
			System.out.println("The word has "+numOfVowels(word)+" vowels.");
			System.out.println(getLetters(word));
		}
		else
		{
			throw new Exception("The user entered a number");
		}
		
	}
	//Length method
	public static int getLength(String str)throws Exception{
		if(str.endsWith(String.valueOf(str.charAt(0))))
		{
			int length = str.length();
			return length;
		}
		else
		{
			throw new Exception("The user entered a number");
		}
		
	}
	//Vowels method
	public static int numOfVowels(String str)throws Exception{
		if(str.endsWith(String.valueOf(str.charAt(0))))
		{
			str = str.toLowerCase();
			int vowels = 0;
			int i = 0;
			for(i = 0; i<= str.length(); i++)
			{
				char ch = str.charAt(i);
				if(ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u')
				{
					vowels++;
				}
			}
			return vowels;
		}
		else
		{
			throw new Exception("The user entered a number");
		}
	}
	//First letter and last letter method
	public static String getLetters(String str)throws Exception{
		if(str.endsWith(String.valueOf(str.charAt(0))))
		{
			char firstLetter = str.charAt(0);
			char lastLetter = str.charAt(str.length() - 1);
			String results = firstLetter+" , "+lastLetter;
			return results;
		}
		else
		{
			throw new Exception("The user entered a number");
		}
	}

}
