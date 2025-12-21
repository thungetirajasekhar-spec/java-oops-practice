import java.util.ArrayDeque;
public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> d=new ArrayDeque<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		d.add(40);
        System.out.println(d);
        System.out.println("---------");
        System.out.println(d.poll());
        System.out.println("---------");
         for(Object k:d)
         {
        	 System.out.println(k);
         }
	    
	System.out.println(d.remove(20));
	System.out.println(d);
	}
	
    
}
