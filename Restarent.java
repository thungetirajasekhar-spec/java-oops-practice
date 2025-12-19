package LearningJava;

class Custemer extends Thread
{
	synchronized void FoodOrder(String orderName)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name+ "custumer order"+orderName);
		
		try 
		{
			wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("thread" +name+ "food is deliverd the custemer");
	}
	synchronized void cookedOrder(String orderName)
	{
	   	String name=Thread.currentThread().getName();
		System.out.println(name+ " chef has receive the  order"+orderName);
		String name=Thread.currentThread().getName();
		System.out.println(name+ "cooking is under progress!");
		
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread"+ name + " order is ready!");
		notifyAll();
	}
	synchronized void receiveOrder()
		{
		String name=Thread.currentThread().getName();
		System.out.println(name+ "  custemer is chosing  an order------" );
		try
		{
			wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread"+ name + "  custermer recived the order!"+ orderName);
	}
	 
}
public class Restarent {

	public static void main(String[] args) {
		custemer c=new custemer();
		String orderName="biriyani";
		Thread t1=new Thread("custemer") {
			public void run()
			{
				c.receiveOrder(orderName);
			}
		};
		t1.start();
	}

}
