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
	
	public void analyseString() throws Exception{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
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
			if(count%5==0)
			{
				fifthWord += s+" ";
			}
			words += s;
		}
		String [] wordsArray = words.split(" ");
		File [] fa = new File[5];
		for(int i = 0; i<fa.length; i++)
		{
			fa[i] = new File("C:\\Users\\A00239007\\Desktop\\text"+(i+1)+".txt");
		}
		splitFiles(fa,wordsArray);
		double avgVowels = (vowels/count);
		System.out.println("The number of words in this file is: "+count);
		System.out.println("The number of vowels in this file is: "+vowels);
		System.out.println("The average number of vowels per word in this file is: "+avgVowels);
		System.out.println("");
		System.out.println("");
		System.out.println(jumble);
		System.out.println("");
		System.out.println("");
		System.out.println(fifthWord);
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
		}
		String jumble1 = new String(jumble);
		return jumble1;
	}
	
	public void splitFiles(File [] fa, String [] s) throws FileNotFoundException
	{
		int partition = s.length/fa.length;

        for (int i = 0; i < fa.length; i++)
        {
            PrintWriter pw = new PrintWriter(fa[i]);

            for (int j =(i * partition); j < ((i+1) * partition); j++)
            {
                pw.println(s[j]);
            }

            pw.close();
	}
}
}
