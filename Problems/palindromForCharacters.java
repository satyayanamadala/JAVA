import java.util.Scanner;

class palindromForCharacters {
    public static boolean isPalindrome(String str) {
        String reversed = ""; // Initialize an empty string to store the reversed version of the input string

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);// Check if the original string is equal to the reversed string and return the result
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome string");
        } else {
            System.out.println("Not a palindrome string");
        }

        sc.close();
    }
}