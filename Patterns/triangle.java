
public class triangle {
    public static void main (String[] args){

    // right angle triangle
    //    int rows = 5;
    //     for(int i =1; i <=rows; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    int n = 4;
    for(int i=0; i<n; i++){
        for(int k=n; k>i+1; k--){
            System.out.print(" ");
        }
        for(int j=0; j<=i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }


    // equilateral triangle
    //  int rows = 4;
    //     for(int i= 1; i<=rows; i++){            // outer loop for number of rows
    //         for(int j=rows; j>=i; j--){         // spacings between stars
    //             System.out.print(" ");
    //         }
    //             for(int j=1; j<=i; j++){        //inner loop for number of stars j represents number of stars
    //                 System.out.print("* ");
    //             }
    //         System.out.println();               // new line after each row
    //     }
        

    // // inverted triangle
    //      int rows =5;
    //     for(int i=rows; i>=1; i--){            // outer loop for number of rows
    //         for(int j=rows; j>=i; j--){        // spacings between stars
    //             System.out.print(" ");
    //         }
    //             for(int j=1; j<=i; j++){       //inner loop for number of stars j represents number of stars
    //                 System.out.print("* ");
    //             }
    //         System.out.println();              // new line after each row
    //     }
 
    }
}