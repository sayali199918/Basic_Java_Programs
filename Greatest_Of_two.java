import java.util.*;
public class Greatest_Of_Two
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter a first number:");
		a=sc.nextInt();
		System.out.println("Enter a Second number:");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(a+ "is Greater Number");
		}
		else if(a<b)
		{
			System.out.println(b+ "is Greater Number");
		}
		else
		{
			System.out.println("Both the numbers are equal");
		}
	}
}