public class Prime1To100 {
    public static void main(String [] args){
        for(int number = 1; number <=100; number++){
            boolean isprime =true;  // assume number is prime

            for(int i=2; i*i<=number; i++){  // optimization Loop   
                if(number % i == 0){   // not prime
                    isprime = false;   // set flag
                    break;             // exit loop
                }
            }

            if(isprime){
                System.out.print(number + " ");   // print prime number
            }
        }
    }
}
