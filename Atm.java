package LearningJava;
import java.util.Scanner;
class Atm
{
	int acc_number=1234567;
	int password=12345;
	int AN,PWD;
	void acceptInput()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("enter the account number:");
		AN=s.nextInt();
		System.out.println("enter the password:");
		PWD=s.nextInt();
	}
	void verify()
	{
		if (acc_number==AN && password==PWD)
		{
			System.out.println("-------collect your amount-----");
		}
		
		else
		{
			System.out.println("-----invalid details---");
			System.out.println("-----try again---");
			
		}
	}
}
class Bank{
	public static void main(String[] args) {
		Atm atm=new Atm();
		atm.acceptInput();
		atm.verify();
	}

}
