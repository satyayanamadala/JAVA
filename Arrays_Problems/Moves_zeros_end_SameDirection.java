public class Moves_zeros_end_SameDirection {
    public static void main(String [] args){
        int[] arr ={0,1,0,1,3,4,7};
        int i = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
