import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class LiveRegisterDirectory {

	public static void main(String [] args) throws FileNotFoundException
	{
		File csvFile = new File("C:\\Users\\A00239007\\Downloads\\all_persons_under_25.csv");
		String[] line = new String[130];
		int count = 0;
		Scanner sc = new Scanner(csvFile);
		ArrayList<String[]> list = new ArrayList<String[]>();
		while(sc.hasNextLine())
		{
			line[count] = sc.nextLine();
			list.add(line);
			count++;
		}
		for(String[] print : list)
		{
			for(int i = 0; i<print.length; i++)
			{
				System.out.println(print[i]);
			}
		}
	}
}
