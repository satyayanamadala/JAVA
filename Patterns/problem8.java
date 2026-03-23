public class problem8 {
    public static void main(String[] args){
        int n = 4;
        for(int i=0; i<n; i++){     // outer loop for number of rows
            //Spaces
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            //Stars 
                for(int j=0; j<(2*n)-(2*i+1); j++){
                    System.out.print("*");
                }  
        System.out.println();                                               
        }

    /*
            for(int i=1; i<=n; i++){     // outer loop for number of rows
            //Spaces
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            //Stars 
                for(int j=1; j<=2*(n-i)+1; j++){
                    System.out.print("*");
                }  
        System.out.println();                                               
        } */
    }
    
}
