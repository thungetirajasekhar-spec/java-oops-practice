package LearningJava;

import java.util.*;

public class ExampleForStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println("---------");
		for (Object O: s)
		{
			System.out.println(O);
		}
	}

}
