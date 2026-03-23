public class Check_Palindrome_Strings {
    public static void main(String[] args) {
        String str = "madam";
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while(start < end){
            if(str.charAt(start) != str.charAt(end) ){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println(isPalindrome? "Palindrome" : "Not a Palindrome");
    }
}
