import java.util.Scanner;
class Size_k{
    void maxSumSubarray(int[] arr, int k){
    
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid subarray size. Please enter k between 1 and " + arr.length);
            return;
        }

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

public class Max_Sum_Subarray_Size_K {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Size_k s = new Size_k();
        System.out.println("Enter the size of the subarray: ");
        int k = sc.nextInt();

        s.maxSumSubarray(arr, k);
        sc.close();
        
    }
}
