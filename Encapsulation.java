
    class Student
    {
        //attributes
        private String name;
        private String roll;
        private String email;
        private int age;
        //setter method
        public void setData(String x, String y,String z,int a)
        {
            name=x;
            roll=y;
            email=z;
            age=a;
        }
        public String getName()
        {
            return name;
        }
        public String getRoll()
        {
            return roll;
        }
        public String getEmail()
        {
            return email;
        }
        public int getAge()
        {
            return age;
        }

    }
    public class Encapsulation {
        public static void main(String[] args) {
            {
                Student s=new Student();
                Student s2=new Student();
                s2.setData("sekhar","a302","rajau@gmail.com",20);
                s.setData("raj","3235","thungetirajasekhar@gmail.com",22);
                System.out.println("the name student:",s.getName());
                System.out.println("the roll no student:",s.getRoll());
                System.out.println("the email for the student",s.getEmail());
                 System.out.println("the student age",getAge());
            }
        }
    }
