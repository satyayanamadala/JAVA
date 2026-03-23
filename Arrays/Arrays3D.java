public class Arrays3D {
    public static void main(String[] args){
      int nums[][][]= new int[3][4][4];
      
      for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
              for(int k=0;k<4;k++){
                nums[i][j][k] = (int)(Math.random()*10); 
                System.out.print(nums[i][j][k] + " ");
              }
            }
            System.out.println();
      }
        System.out.println("Using for-each loop:");
      //  Enhanced for loop
      // for(int n[] : nums){
      //   for(int m : n){
      //       System.out.print(m + " ");
      //   }
      //   System.out.println();
      // }
    }
}
