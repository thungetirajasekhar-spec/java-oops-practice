import java.util.LinkedHashMap;

public class ExampleForLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lm=new LinkedHashMap();
		lm.put("name","raj");
		lm.put("age",21);
		System.out.println(lm);
		
		System.out.println("------------");
		System.out.println(lm.get(0));
		System.out.println("------------");
		for (Object i:lm.keySet())
		{
			System.out.println(i);
		}
		System.out.println("------------");
		for (Object i:lm.entrySet())
		{
			System.out.println(i);
		}
		

	}

}
