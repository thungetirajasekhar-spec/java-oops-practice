package LearningJava;

import java.util.LinkedList;

class Car {
    private String name;
    private String color;

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [Name=" + name + ", Color=" + color + "]";
    }
}

public class Example2ForVector {

    public static void main(String[] args) {

        Car c = new Car("BMW", "Black");

        LinkedList<Car> l1 = new LinkedList<>();
        l1.add(c);

        for (Car i : l1) {
            System.out.println(i);
        }
    }
}
