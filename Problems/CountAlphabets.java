class CountAlphabets{
    public static void main (String [] args){
        String str = "JAVA-java123!";
        int count = 0;

        for(int i=0; i < str.length();i++){
            char ch = str.charAt(i);

            if(ch >='A' && ch <='Z' || ch >='a' && ch <='z'){ //    if(Character.isLetter(ch)){ count++;}
                count++;
            }
        }
        System.out.println("Number of Alphabets:" + count);
    }
}