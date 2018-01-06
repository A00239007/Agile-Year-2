import java.util.Scanner;

public class LeapYear {
	public boolean Leap(int year) throws Exception
	{
		if(year >= 1582)
		{
			if(year%400 == 0)
			{
				return true;
			}
			if(year%100 == 0)
			{
				return false;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(year%4 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	public static void main(String [] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a year");
		int year = sc.nextInt();
		LeapYear test = new LeapYear();
		boolean check = false;
		check = test.Leap(year);
		if(check == true)
		{
			System.out.println("The year is a leap year");
		}
		else
		{
			System.out.println("The year isn't a leap year");
		}
	}
}
