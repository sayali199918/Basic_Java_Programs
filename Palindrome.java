import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n + "Number is Palindrome");
		}
		else
		{
			System.out.println(n + "Number is not a Palindrome");
		}
		
	}
}