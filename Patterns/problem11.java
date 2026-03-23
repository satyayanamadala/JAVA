class Rectangle{
    public static void rectangle(int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0; j<m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class problem11 {
    public static void main(String[] args) {
        Rectangle.rectangle(5,8);
        
    }
}
/*
* * * * *
* * * * *
* * * * *
*/