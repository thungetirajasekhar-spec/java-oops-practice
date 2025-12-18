package LearningJava;
import java.util.Scanner;

public class ExceptionExample
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the num:");
		int a=s.nextInt();
		System.out.println("enter the num:");
		int b=s.nextInt();
		try
		{
			int d=a/b;
			System.out.println(d);
			int []z= {1,2,3,4};
			System.out.println(z[5]);

		}
		catch(ArithmeticException e)
		{
			System.out.println("not possible to divide:");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array entra idhi:");
		}
		finally
		{
			System.out.println("----------");
		}
	}
}
