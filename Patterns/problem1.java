class Square{
    public static void square(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class problem1 {
    public static void main(String[] args){

        Square.square(4);

    }
}
/*

* * * *
* * * * 
* * * * 
* * * *

*/
