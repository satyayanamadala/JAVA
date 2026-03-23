public class Prefix_Sum {
    public static void main(String [] args){
        int[] arr ={1, 2, 3, 4, 5};
        
        for(int j=1; j<arr.length; j++){
            arr[j] = arr[j] + arr[j-1];
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
