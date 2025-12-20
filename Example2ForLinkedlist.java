package LearningJava;

import java.util.LinkedList;

class Employee {

    private String empname;
    private String empDesignation;
    private String empEmail;

    public Employee(String empname, String empDesignation, String empEmail) {
        this.empname = empname;
        this.empDesignation = empDesignation;
        this.empEmail = empEmail;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public String toString() {
        return "Employee [Name=" + empname +
               ", Designation=" + empDesignation +
               ", Email=" + empEmail + "]";
    }
}

public class Example2ForLinkedlist {

    public static void main(String[] args) {

        Employee e1 = new Employee("vanisha", "tester", "vanisha@gmail.com");
        Employee e2 = new Employee("manisha", "developer", "manisha@gmail.com");
        Employee e3 = new Employee("vani", "teacher", "vani@gmail.com");

        LinkedList<Employee> l1 = new LinkedList<>();
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);

        for (Employee i : l1) {
            System.out.println(i);
        }
    }
}
