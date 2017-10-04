import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StringJumbler {

	public static void main(String [] args) throws Exception
	{
		StringJumbler g = new StringJumbler();
		g.analyseString();
	}
	
	public void analyseString() throws Exception{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		String s = null;
		String jumble = "";
		int count = 0;
		int vowels = 0;
		while(sc.hasNext())
		{
			s = sc.next();
			vowels += countVowels(s);
			count++;
			jumble += jumbleString(s) + " ";
		}
		double avgVowels = (vowels/count);
		System.out.println("The number of words in this file is: "+count);
		System.out.println("The number of vowels in this file is: "+vowels);
		System.out.println("The average number of vowels per word in this file is: "+avgVowels);
		System.out.println("");
		System.out.println("");
		System.out.println(jumble);
	}
	
	public int count() throws FileNotFoundException
	{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
		Scanner sc = new Scanner(f);
		String s = null;
		int count1 = 0;
		while(sc.hasNext())
		{
			s = sc.next();
			count1++;
		}
		return count1;
	}
	
	public int vowels() throws FileNotFoundException
	{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		String s = null;
		int vowels1 = 0;
		while(sc.hasNext())
		{
			s = sc.next();
			vowels1 += countVowels(s);
		}
		return vowels1;
	}
	
	public double avgVowels() throws FileNotFoundException
	{
		StringJumbler p = new StringJumbler();
		int count = p.count();
		int vowels = p.vowels();
		double avg = vowels/count;
		return avg; 
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
	
	public String jumbleString(String s)throws Exception
	{
		char [] jumble = s.toCharArray();
		if(jumble.length > 3)
		{
			for(int i = 1; i < (jumble.length-1); i++)
			{
				double flip = Math.random();
				if(flip > 0.5)
				{
					char temp = jumble[i];
					jumble[i] = jumble[i+1];
					jumble[i+1] = temp;
				}
			}
			String jumble1 = new String(jumble);
			if(s != jumble1)
			{
				throw new Exception("No match");
			}
			return jumble1;
		}
		else
		{
			return s;
		}
	}
	
}
