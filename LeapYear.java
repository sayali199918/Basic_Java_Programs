import java.util.*;
public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Year;
		System.out.println("Enter a Year:");
		Year =sc.nextInt();
		if(Year%4==0)
		{
			if(Year%100==0)
			{
				if(Year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a leap year");
				}
			}
			else
			{
				System.out.println("Not a Leap year");
			}
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}
}
//if((year%400==0) || (year%4==0 && year%100=!0))