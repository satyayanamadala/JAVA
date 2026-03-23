
class Mobile{
    String brand;       // instance variable
    int price;
    static String type;

    public void showDetails(){
        String name = "Satya ";         // local variable
        System.out.println(name + brand + " : " + price + " -> " + type);
    }

    public void add(int x, int y){
        System.out.println(x+y);
    }
}

public class staticVariables {
    public static void main (String[] args){
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1200;
        Mobile.type = "Smartphone";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1000;
        Mobile.type = "phone";

        mobile1.showDetails();
        mobile2.showDetails();

        Mobile mobile = new Mobile();
        mobile.add(5,5);

        
    }
}
