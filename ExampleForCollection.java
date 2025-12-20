 package LearningJava;

import java.util.ArrayList;
import java.util.List;

public class ExampleForCollection {

    public static void main(String[] args) {

        
        List  l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(70);

        System.out.println("List: " + l);

        // Enhanced for loop
        for (Object i : l) {
            System.out.println(i);
        }

        System.out.println(l.size());
        System.out.println(l.contains(10));
        System.out.println( l.get(1));

        // Normal for loop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + ": " + l.get(i));
        }

        System.out.println("-------------------");

        
        ArrayList  al = new ArrayList ();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        for (Object i : al) {
            System.out.println(i);
        }

        System.out.println("ArrayList: " + al);
        System.out.println("-------------------");
    }
}