public class PrimeNumber {
    public static void main(String [] args){
        int number = 10;
        boolean isprime = true;

        if(number <=1){
            isprime = false;
        }

        for(int i=2; i<=number/2; i++){    // optimization Loop for (int i = 2; i * i <= n; i++)
            if(number % i == 0){
                isprime = false;
                break;
 
            }
        }

        if(isprime){
            System.out.println("The number is prime: " + number);
        }
        else{
            System.out.println("The number is Not prime: " + number);
        }
    }
}
