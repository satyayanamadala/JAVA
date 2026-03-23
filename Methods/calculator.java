class Calculators{   //class creation
    public int add(int a, int b){  //method creation
        return a+b;
    }
    public int add(int a, int b, int c, int d){  //method overloading having same name with different parameters.
        return a+b+c+d;
    }
    public double add(double a, double b, double c){ //method overloading having same name with different parameters.
        return a+b+c;
    }
    public int sub(int a, int b){ //method creation
        return a-b; 
    }
    public int mul(int a, int b){ //method creation 
        return a*b;
    }
}

public class calculator {

    public static void main (String []arg){
        Calculators cal = new Calculators();   //object creation
        int res0 = cal.add(2,3);
        double res1 = cal.add(2.2,3.3,3.2);
        int res2 = cal.sub(5, 2);
        int res3 = cal.mul(4,5);
        int res4 = cal.add(2,3,4,5);
        System.out.println("Addition for two integers: " + res0);
        System.out.println("Addition for three doubles: " + res1);
        System.out.println("Subtraction: " + res2);
        System.out.println("Multiplication: " + res3);
        System.out.println("Addition for four integers: " + res4);



    }

    
}
