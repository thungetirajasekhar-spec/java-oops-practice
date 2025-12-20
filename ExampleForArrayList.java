package LearningJava;

import java.util.ArrayList;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name = " + name + ", Age = " + age;
    }
}

public class ExampleForArrayList {

    public static void main(String[] args) {

        Student s1 = new Student("raj", 22);
        Student s2 = new Student("sekhar", 20);

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);

        for (Student s : al) {
            System.out.println(s);
        }
    }
}
