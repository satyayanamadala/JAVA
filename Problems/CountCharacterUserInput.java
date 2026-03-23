import java.util.Scanner;
class CountCharacterUserInput{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE STRING:");
        String str = sc.nextLine();                 //Takes full line input (including spaces).
        str = str.toLowerCase();                    

        System.out.println("ENTER THE CHARACTER:");
        char target = sc.next().charAt(0);          //  sc.next() → takes input as String. 
        target = Character.toLowerCase(target);           //  .charAt(0) → extracts first character.
        
        int count=0;                                      
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){   //
                count++;
            }
        }
        System.out.println("CHARACTER: " + target + "  - "+" Appears: " + count + "times.");
    }
}