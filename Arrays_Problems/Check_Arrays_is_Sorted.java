public class Check_Arrays_is_Sorted {
    public static void main(String[] args){
        int[] arr = {1,2,2,4,6};
        boolean isSorted = true; // Initialize isSorted to true
        for(int i=0;i<arr.length-1;i++){ // Loop through the array until the second last element
            if(arr[i] > arr[i+1]){
                isSorted = false; // Set isSorted to false if the current element is greater than the next element
                break; // Break the loop if the array is not sorted
            }
        }
        if(isSorted){
            System.out.println("The array is sorted in ascending order.");
        }
        else{
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}
