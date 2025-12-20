package LearningJava;
import java.util.Vector;

public class ExampleForVector {

	public static void main(String[] args) {
		Vector v =new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("java");
		System.out.println(v);
		System.out.println("-------------");
		System.out.println(v.get(2));
		System.out.println("-------------");
		System.out.println(v.isEmpty());
		System.out.println("-------------");
		System.out.println(v.contains(2));
		System.out.println("-------------");
		System.out.println(v.size());
		System.out.println("-------------");
		for (Object i: v)
		{
			System.out.println(i);
			
		}
	}

}
