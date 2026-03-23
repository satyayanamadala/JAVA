public class Reverse_String {
        public static void main(String[] args){
        char arr[] = {'a', 'b', 'c', 'd', 'e'};
        int left = 0;
        int right = arr.length -1;

        // Reverse the char array
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        // Print the reversed char array
        System.out.println("Reversed char array:");
        for(char num : arr){
            System.out.print(num +" ");
        }
    }
    
}
