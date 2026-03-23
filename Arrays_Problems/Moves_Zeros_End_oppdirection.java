public class Moves_Zeros_End_oppdirection {
    public static void main(String [] args){
        int[] arr = {0,1,0,1,3,4,7};
        int start =0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[end] == 0){
                end--;
            }
            else if(arr[start] != 0){
                start++;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
