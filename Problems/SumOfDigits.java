public class SumOfDigits {
    public static void main(String [] args){
        int number = 12345;
        int sum = 0;
        while(number > 0){
            int digit = number % 10; // To Get The Last Number - always gives the last digit
            sum = sum + digit;
            number = number / 10; // To Remove The Last Number
        }
        System.out.println("The sum of digits is :" + sum);
    }
}
