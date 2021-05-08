import java.util.*;
public class Greatest_Of_Three
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a first number:");
		a=sc.nextInt();
		System.out.println("Enter a Second number:");
		b=sc.nextInt();
		System.out.println("Enter a Second number:");
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+ "is Greater Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ "is Greater Number");
		}
		else if(c>a && c>b)
		{
			System.out.println(c+ "is Greater Number");
		}
		else
		{
			System.out.println("All numbers are Equal");
		}
	}
}