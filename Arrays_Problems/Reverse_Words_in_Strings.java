public class Reverse_Words_in_Strings {
    public static void main(String[] args) {
        String str = "yanamadala satya narayana";
        int i = str.length() -1 ;
        String rev = "";

        while(i>=0){
            // skip the spaces
            while(i>=0 && str.charAt(i) == ' '){
                i--;
            }
            // if we have reached the end of the string, break the loop
            if(i<0){
                break;
            }
            // get the end index of the word
            int j = i;
            
            while(i>=0 && str.charAt(i) != ' '){
                i--;
            }
            
            String word = str.substring(i+1,j+1);
            if(rev.length() == 0){
                rev = word;
            }
            else{ 
                rev = rev +" "+ word;
            }
        }
        System.out.println(rev);

    }
}
