package task1;
import java.util.ArrayList;
import java.util.List;
public class vd3 {
    public static void main(String[] args){
        List<String> topCom=new ArrayList<>();

        System.out.println("IsEmpty:"+topCom.isEmpty());

        topCom.add("Google");
        topCom.add("Apple");
        topCom.add("Microsoft");
        topCom.add("Amazon");

        System.out.println("Top"+topCom.size()+"in the world");
        System.out.println(topCom);

        String bestCom=topCom.get(0);
        String secondBestCom=topCom.get(1);
        String lastCom=topCom.get(topCom.size()-1);

        System.out.println("Best:"+bestCom);
        System.out.println("Second bets:"+secondBestCom);
        System.out.println("Last:"+lastCom);
    }
}
