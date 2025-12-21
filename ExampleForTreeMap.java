import java.util.TreeMap;

public class ExampleForTreeMap {
	public static void main(String[] args) {
		
		TreeMap tm =new TreeMap();
		tm.put("name","pavan");
		tm.put("age",24);
		tm.put("email","raj@gmail.com");
		System.out.println(tm);
		System.out.println("--------");
		for(Object j:tm.keySet())
		{
			System.out.println(j);
			
		}
		System.out.println("------------");
		for (Object i:tm.entrySet())
		{
			System.out.println(i);
		}
	}   
		

}
