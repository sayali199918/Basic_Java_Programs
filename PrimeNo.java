import java.util.*;
public class PrimeNo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int temp=0;
		if(num==0 || num==1)
		{
			System.out.println("Not a Prime");
		}
		else
		{
			for(int i=2;i<num-1;i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp>0)
			{
				System.out.println(num+ "is a Not a Prime Number");		
			}
			else
			{
				System.out.println(num+ "is a Prime Number");
			}
		}
	}
}