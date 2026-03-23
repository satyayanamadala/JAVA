class personalInfo{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void Setname(String a){
        name = a;
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int b){
        age = b;
    }
}

public class Encapsulation {
    public static void main (String[] args){
        personalInfo info = new personalInfo();
        info.Setname("Yanamadala Satyanarayana");
        info.SetAge(20);
        System.out.println(info.getName());
        System.out.println(info.getAge());
    }
}
