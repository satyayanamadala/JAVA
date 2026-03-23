public class Check_Is_Palindrome {
    public static void main(String[] args) {
        int[] number = {1, 3, 4, 1};
        int start = 0;
        int end = number.length - 1;

        boolean isPalindrome = true;
        while(start < end){
            if(start != end){ // Check if the elements at start and end are not equal
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome"); // Print the result

        for(int num : number){
            System.out.print(num + " ");
        }
    }
}
