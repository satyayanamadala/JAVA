class Solution10{
    public static void problem(int n){
        triangle(n);
        invertedTriangle(n);
    }

    public static void triangle(int n){
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedTriangle(int n){
        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class problem10 {
    public static void main(String[] args) {
        Solution10.problem(4);
        
    }
}
/*

****
***
**
*

 */
