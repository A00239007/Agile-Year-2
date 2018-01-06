import java.util.Scanner;

public class Sorter {
	public String NumSorter(int num1, int num2, int num3) throws Exception
	{
		if(num1 == (int)num1 && num2 == (int)num2 && num3 == (int)num3)
		{
			int temp = 0;
			String numbers = "";
			if(num1>num2)
			{
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			if(num2>num3)
			{
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			numbers += num1+", "+num2+", "+num3;
			return numbers;
		}
		else
		{
			throw new Exception("An invalid value was inputted");
		}
	}
	
	public static void main(String [] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter value 1: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter value 2: ");
		int num2 = sc.nextInt();
		System.out.println("Please enter value 3: ");
		int num3 = sc.nextInt();
		Sorter obj = new Sorter();
		System.out.println(obj.NumSorter(num1, num2, num3));
	}
}
