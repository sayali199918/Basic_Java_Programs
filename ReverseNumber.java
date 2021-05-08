import java.util.*;
public class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter a Number:");
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse number is:"+rev);
	}
}