
class management{
    String name; // instance variable
    int age;
    public  management() { // default constructor
        name = "Unknown";
        age = 0;
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

public class constructor {
    public static void main(String[] args){
        management obj = new management();
        obj.setname("Satya");
        obj.setage(20);
        System.out.println("Name:" + obj.getname()+ " - " + "age:" + obj.getage());

    }
}
