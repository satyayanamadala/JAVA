public class problem7 {
    public static void main(String[] args){
        int n = 4;
        for(int i=1; i<=n; i++){     // outer loop for number of rows
            //Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Stars 
                for(int j=1; j<=2*i-1; j++){
                    System.out.print("*");
                }  
        System.out.println();                                               
        } 
    }  
}
  /*       *      3=spaces(n-i)    1=stars(2*i-1)
          ***     2                3
         *****    1                5
        *******   0                7
  */