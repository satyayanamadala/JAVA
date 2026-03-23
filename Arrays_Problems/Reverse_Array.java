public class Reverse_Array {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int left = 0;
        int right = arr.length -1;

        // Reverse the array
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        // Print the reversed array
        System.out.println("Reversed array:");
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
    
}
