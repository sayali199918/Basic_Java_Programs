//import java.util.*;
public class PrimeRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Starting Number:");
		int start=sc.nextInt();
		System.out.println("Enter a Ending Number:");
		int end=sc.nextInt();
		int temp;
		for(int i=start; i<=end; i++)
		{
			temp=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(i);
			}
			
		}
	}
}