public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        int temp = number;
        int rev = 0;

        while(number >0){
            int digit = number % 10; //to get the last digit
            rev = rev * 10 + digit; //append digit to the reversed number
            number = number / 10; //to remove the last digit
        }

        if(temp == rev){
            System.out.println("The Number is a Palindrome :" + rev);
        }
        else{
            System.out.println("The Number is NOT a Palindrome :" + rev);
        }

    }
}
