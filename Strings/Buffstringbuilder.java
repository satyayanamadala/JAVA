public class Buffstringbuilder{
    public static void main(String[] args){
        StringBuffer strBuff = new StringBuffer("Hello");
        strBuff.append(" World!");
        System.out.println(strBuff);
        StringBuilder strBuilder = new StringBuilder("SatyaNarayana");
        strBuilder.append(" Yanamadala");
        strBuilder.insert(5 , " prasad ");
        System.out.println(strBuilder.reverse());
        System.out.println(strBuilder.capacity());
        StringBuffer sb = new StringBuffer("satya");
        System.out.println(sb.capacity());

        
    }
}