import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	public static void main(String [] args) throws FileNotFoundException
	{
		File f = new File("C:\\Users\\A00239007\\Desktop\\text.txt");
		Scanner sc = new Scanner(f);
		String sentence = "";
		while(sc.hasNextLine())
		{
			sentence = sentence + sc.nextLine();
		}
		
		String [] words = sentence.split(" ");
		sort(words);
		for(int i = 0; i<words.length;i++)
		{
			System.out.print(words[i]+" ");
		}
		Books b = new Books();
	
	}
	
	public static void swap(String [] b, int i, int j)
	{
		String temp = b[i];
		b[i]=b[j];
		b[j] = temp;
	}
	
	public static void sort(String [] b)
	{
		for(int i = 0; i<b.length; i++)
		{
			int least = i;
			for(int j = i+1; j<b.length;j++)
			{
				if((b[j]).compareTo(b[least])<1)
				{
					least = j;
				}
			}
			swap(b,i,least);
		}
	}
}
