

class Mobile{
    String brand;       // instance variable
    int price;
    static String type;
    String name = "Satya ";         // instance variable

    public void showDetails(){
        String names = "Satya ";         // local variable
        System.out.println(names + brand + " : " + price + " -> " + type);
    }

    public static void show1(Mobile mobile1){
        System.out.println("Static method called");
        System.out.println(mobile1.name + mobile1.brand + " : " + mobile1.price + " -> " + type);
    }
}
public class staticMethods {
        public static void main (String[] args){
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1200;
        Mobile.type = "Smartphone";

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1000;
        Mobile.type = "phone";

        // mobile1.showDetails();
        // mobile2.showDetails();
        Mobile.show1(mobile1);
    }
}