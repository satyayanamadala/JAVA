
class Mobile{
    String brand;       // instance variable
    int price;
    static String type;

    public void showDetails(){
        String name = "Satya ";         // local variable
        System.out.println(name + brand + " : " + price + " -> " + type);
    }
    static{
        type = "Smartphone";               // static block
    }
    public void add(int x, int y){
        System.out.println(x+y);
    }
}
public class staticBlock {
        public static void main (String[] args){
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 1200;
       
        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 1000;
    
        mobile1.showDetails();
        mobile2.showDetails();
     }
}
