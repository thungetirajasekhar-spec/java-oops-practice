package LearningJava;

class Demo
{
	void divide() throws ArithmeticException
	{
		int n1=25;
		int n2=0;
		System.out.println(n1/n2);
	}
}

public class Example {

	public static void main(String[] args) {
		 Demo d =new Demo();
		 try
		 {
			 d.divide();
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("passkey is wrong:");
			 System.out.println("thanks for visite");
			 
		 }

	}

}
