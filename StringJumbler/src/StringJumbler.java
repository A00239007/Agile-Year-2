import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringJumbler {

	public static void main(String [] args) throws FileNotFoundException
	{
		StringJumbler g = new StringJumbler();
		String file = g.analyseString();
		System.out.println("They're "+g.countWords(file)+" words in this file.");
		System.out.println("They're "+g.countVowels(file)+" words in this file.");
	}
	
	public String analyseString() throws FileNotFoundException{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		String s = sc.next();
		return s;
	}
	
	public int countWords(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char current = s.charAt(i);
			if(current == ' ')
			{
				count++;
			}
		}
		return count;
	}
	
	public int countVowels(String s){
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			char current = s.charAt(i);
			if(current == 'e' || current == 'i' || current == 'a' || current == 'o' || current == 'u')
			{
				count++;
			}
		}
		return count;
	}
	
	public String jumbleString(String s)
	{
		
		ArrayList<String> t = new ArrayList<>();
		for(int i = 0; i < s.length(); i++)
		{
			
		}
		return s;
	}
	
}
