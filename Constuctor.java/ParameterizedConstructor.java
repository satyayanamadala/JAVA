class Student{
    String name; // instance variable
    int age;
    public  Student() { // default constructor
        name = "Unknown";
        age = 0;
    }

    public Student(String name){    // parameterized constructor for only NAME
        this.name = name;
        this.age = 0;                // default age 0
    }
    public Student(int age, String name) {   // parameterized constructor for AGE and NAME
        this.age = age;
        this.name = name;
    }

    public String getname(){    // getter method  
        return name;
    }
    public void setname(String name){   // setter method
        this.name = name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args){
        Student student = new Student("narayana");
        Student student1 = new Student(22,"jai");
        // student.setname("Satya");
        // student.setage(20);
        System.out.println("Name:" + student.getname()+ " - " + "age:" + student.getage());
        System.out.println("Name:" + student1.getname()+ " - " + "age:" + student1.getage());


    }
}
