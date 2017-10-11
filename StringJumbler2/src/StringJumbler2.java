import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StringJumbler2{

	public static void main(String [] args) throws Exception
	{
		StringJumbler2 g = new StringJumbler2();
		g.analyseString();
	}
	
	public void analyseString() throws Exception
	{
		File f = new File("C:\\Users\\Simon Harper\\Desktop\\New Folder\\text.txt");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(f);
		String s = null;
		String jumble = "";
		int count = 0;
		int vowels = 0;
		String words = null;
		String fifthWord = "";
		while(sc.hasNext())
		{
			s = sc.next();
			vowels += countVowels(s);
			count++;
			jumble += jumbleString(s) + " ";
			words +=  s + " ";
		}
		String [] wordsArray = words.split(" ");
		File [] fa = new File[5];
		for(int i = 0; i < fa.length; i++)
		{
			fa[i] = new File("C:\\Users\\Simon Harper\\Desktop\\New Folder\\text"+(i+1)+".txt");
		}
		splitFiles(fa,wordsArray);
		double avgVowels = (vowels/count);
		System.out.println("The number of words in this file is: "+count);
		printCountVowels(vowels);
		System.out.println("The average number of vowels per word in this file is: "+avgVowels);
		System.out.println("");
		System.out.println("");
		printJumbleString(jumble);
		System.out.println("");
		System.out.println("");
		System.out.print(fifthWord(f));
		System.out.println("");
		System.out.println("");
		for(int i = 0; i < fa.length; i++)
		{
			fa[i] = new File("C:\\Users\\Simon Harper\\Desktop\\New Folder\\textShuffled"+(i+1)+".txt");
		}
		jumbleArray(fa);
		splitFiles(fa,wordsArray);
		for(int i = 0; i<fa.length; i++)
		{
			int counts = countWordFile(fa[i]);
			System.out.println("The numnber of words in File "+i+" is: "+counts);
		}
		System.out.println("");
		System.out.println("");
		for(int i = 0; i < fa.length; i++)
		{
			vowels = countVowelFile(fa[i]);
			System.out.println("The number of vowels in File "+i+" is: "+vowels);
		}
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
	
	public void printCountVowels(int i)
	{
		System.out.println("The number of vowels in the file: "+i);
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
		}
		String jumble1 = new String(jumble);
		return jumble1;
	}
	
	public void printJumbleString(String jumble)
	{
		System.out.println(jumble);
	}
	
	public String fifthWord(File f) throws FileNotFoundException
	{
		String currentWord = null;
		String fifthWord = "";
		int count = 0;
		Scanner five = new Scanner(f);
		while(five.hasNext())
		{
			currentWord = five.next();
			if(count%5==0)
			{
				fifthWord += currentWord + " ";
			}
			count++;
		}
		five.close();
		return fifthWord;
	}
	
	public void splitFiles(File [] fa, String [] s) throws FileNotFoundException
	{
		int partition = s.length/fa.length;

        for (int i = 0; i < fa.length; i++)
        {
            PrintWriter pw = new PrintWriter(fa[i]);

            for (int j =(i * partition); j < ((i+1) * partition); j++)
            {
                pw.print(s[j]+ " ");
                
            }

            pw.close();
        }
	}
	
	public void jumbleArray(File [] fa) throws FileNotFoundException
	{	
		for(int i =0; i < fa.length-1; i++)
		{
			double flip = Math.random();
			if(flip > 0.5)
			{
				File temp = fa[i];
				fa[i] = fa[i+1];
				fa[i+1] = temp;
			}
		}
	}
	
	public int countWordFile(File fa) throws FileNotFoundException
	{
		int count = 0;
		String currentWord = "";
		Scanner word = new Scanner(fa);
		while(word.hasNext())
		{
			currentWord = word.next();
			count++;
		}
		word.close();
		return count;
	}
	
	public int countVowelFile(File fa) throws FileNotFoundException
	{
		Scanner vowel = new Scanner(fa);
		String currentWord = "";
		int count = 0;
		while(vowel.hasNext())
		{
			currentWord = vowel.next();
			for(int i = 0; i < currentWord.length(); i++)
			{
				char current = currentWord.charAt(i);
				if(current == 'e' || current == 'i' || current == 'a' || current == 'o' || current == 'u')
				{
					count++;
				}
			}
		}
		vowel.close();
		return count;
	}
	
}
