class Remove_Duplicates_Sorted_Array {
    public static void main(String [] args){
        int[] arr = {1,1,2,2,3,4,4,5};
                  // 0 1 2 3 4 5 6 7
        int i =0 ;

        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println("Length of New Array: "+ (i+1));

        for(int k=0; k<=i; k++){
            System.out.print(arr[k] + " ");
        }
    }
}