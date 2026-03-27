public class Max_Sum_Subarray_Size_K {
        public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};
        int k = 3;
        int Sum = 0;
        
        for(int i=0; i<k; i++){
            Sum = Sum + arr[i];
        }
        int maxSum = Sum;

        for(int i=k; i<arr.length;i++){
            Sum = Sum - arr[i-k] + arr[i];
            maxSum = Math.max(Sum,maxSum);
        }
        System.out.println("Maximum sum of a subarray of size k is: " + maxSum);
    }
}
