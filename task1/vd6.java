package task1;
import java.util.ArrayList;
import java.util.List;
public class vd6 {
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("John");
        names.add("Steven");

        System.out.println("Contains Bob: "+names.contains("Bob"));
        System.out.println("indexOf John:"+names.indexOf("John"));
        System.out.println("IndexOf Alice:" +names.indexOf("Alice"));

        System.out.println("Last indexOf John:"+names.lastIndexOf("John"));
    }
}
