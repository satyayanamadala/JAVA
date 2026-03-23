class Find_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 15, 2, 8};
        int max = arr[0]; // Initialize max to the first element of the array
        for(int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        } 
        System.out.println("The largest element in the array is: " + max);
    }
}
    
