public class Reverse {
    public static void main(String [] args){
        int number = 12345;
        int rev = 0;

        while(number > 0){
            int digit = number % 10; // To get the last digit
            rev = rev * 10 + digit; // Append digit to the reversed number
            number = number / 10; // To remove the last digit
        }
        System.out.println("The reversed number is :" + rev);
    }
}
