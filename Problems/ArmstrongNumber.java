public class ArmstrongNumber {
    public static void main(String [] args){
        int number = 153;
        int temp = number;
        int sum = 0;

        while(number > 0){
            int digit = number % 10; // To get the Last Digit
            sum = sum + (digit * digit * digit) ; // cube of the digit and adding to sum
            number = number / 10; // To remove the last digit
        }

        if(temp == sum){
            System.out.println("The Number is an Armstrong Number :" + sum);
        }
        else{
            System.out.println("The Number is NOT an Armstrong Number :" + sum);
        }

    }
}

