public class ArmstrongNumber {
    public static void main(String [] args){
        int number = 1634;
        int temp = number;
        int sum = 0;
        
        // Count the number of digits
        int digitCount = String.valueOf(temp).length();
        
        while(number > 0){
            int digit = number % 10; // To get the Last Digit
            sum = sum + (int)Math.pow(digit, digitCount); // raise digit to power of digit count and add to sum
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

