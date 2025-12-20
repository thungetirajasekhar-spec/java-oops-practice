package LearningJava;
import java.util.*;

class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [Name=" + name + ", Breed=" + breed + "]";
    }
}

public class ExampleFor {
    public static void main(String[] args) {

        Dog d1 = new Dog("Brown", "Pomeranian");
        HashSet hs=new HashSet();
        hs.add(d1);
        for(Object e:hs)
        {
        System.out.println(hs);
        }
    }
}
