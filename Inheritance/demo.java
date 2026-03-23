public class demo {
    public static void main(String[] args){
        AdvsCals calculator = new AdvsCals();

        int r1 = calculator.add(5,3);
        int r2 = calculator.subtract(10,4);
        int r3 = calculator.multiplication(6,2); 
        double r4 = calculator.power(2,8);
        //System.out.println("Addition Result: " + r1 + ", Subtraction Result: " + r2 + ", Multiplication Result: " + r3);
    
        System.out.println("Power Results:" + r4);
    }
}
