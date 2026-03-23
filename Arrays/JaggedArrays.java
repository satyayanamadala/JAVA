public class JaggedArrays {
    public static void main (String[] args){
        int nums[][] = new int[3][];      //Jagged Array
        
        nums[0] = new int[4];
        nums[1] = new int[3];
        nums[2] = new int[2];

        for (int[] num : nums) {
            for (int j = 0; j < num.length; j++) {
                num[j] = (int)(Math.random()*10);
                System.out.print(num[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Using for-each loop:");
      //  Enhanced for loop
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
        System.out.println();
        }
    } 
}
