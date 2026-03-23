public class CountDigits {
    public static void main(String[] args){
        int number = 123456;
        int count = 0;

        if(number == 0)  // Edge case: 0 has 1 digit
            count = 1;
        
        else{
            while(number > 0){  // Loop until all digits are counted
                number = number / 10; // Remove the last digit
                count++;
            }
        }
        System.out.print(count);
    }
}
