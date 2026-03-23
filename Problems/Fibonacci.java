public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;   // number of Fibonacci numbers to generate
        int a = 0;   // first Fibonacci number
        int b = 1;   // second Fibonacci number
        System.out.print(a+" "+b+" "); // print first two Fibonacci numbers

        for(int i = 2; i<n; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
    
}
