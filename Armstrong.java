import java.util.*;
public class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,sum=0;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println(n + "Number is Armstrong");
		}
		else
		{
			System.out.println(n + "Number is not a Armstrong");
		}
		
	}
}