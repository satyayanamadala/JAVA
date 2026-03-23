
class company{
    public void playmusic(){
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        if(cost>=10){
            return "Here is your pen";
        }
        else{
            return "Not enough money";
        }
    }
}

public class methods {
    public static void main(String []arg){
        company com =new company();
        com.playmusic();
        String result = com.getMePen(2);
        System.out.println(result);
    }
}


