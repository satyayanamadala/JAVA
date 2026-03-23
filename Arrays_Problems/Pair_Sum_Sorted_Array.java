public class Pair_Sum_Sorted_Array {
    public static void main(String[] args) {
        int[] arr ={2, 5, 7, 11, 15};
        int target = 9;
        int start = 0;
        int end = arr.length - 1;
        boolean found = false;
        while(start < end){
            int sum = arr[start]+arr[end];
            if(sum == target){
                System.out.println("Pair found: " + arr[start] +","+ arr[end] );
                found = true;
                break;
            }
            else if(sum > target){
                end--;
            }
            else if(sum < target){
                start++;
            }
        
        }
        if(!found){
            System.out.println("No pair found ");
        }
        
    }
}
