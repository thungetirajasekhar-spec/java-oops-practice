package LearningJava;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		/*Set s=new HashSet();
		Set s1=new LinkedListSet();
		Set s2=new TreeSet();
		*/
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("java");
		hs.add("python");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println("---");
		System.out.println(hs.clone());
		System.out.println("---");
		System.out.println(hs.isEmpty());
		System.out.println("---");
		System.out.println(hs);
		System.out.println("---");
	}

}
