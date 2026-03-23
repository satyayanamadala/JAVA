class Solution {
    public static void problem(int n){
        pyramid(n);
        invertedPyramid(n);
    }

    public static void pyramid(int n){
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
    public static void invertedPyramid(int n){
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
        } 
    }
}

public class problem9 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.problem(4);
    }
}
