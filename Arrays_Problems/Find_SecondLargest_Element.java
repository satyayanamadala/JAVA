class Find_SecondLargest_Element {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,5};
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer
        int secondLargest = Integer.MIN_VALUE; // Initialize secondLargest to the smallest possible integer
        for(int num : arr){
            
            if(num > largest){
                secondLargest = largest; // Update secondLargest to the previous largest
                largest = num; // Update largest 
            }
            else if(num > secondLargest && num != largest){ // Check if num is greater than secondLargest and not equal to largest
                secondLargest = num; // Update secondLargest if num is greater than secondLargest and not equal to largest
            }
        }
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}