package task1;
import java.util.ArrayList;
import java.util.List;

public class vd4 {
    public static void main(String[] args){
        List<String> programmingLanguages=new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");

        System.out.println("Initial List: "+programmingLanguages);
        programmingLanguages.remove(5);
        System.out.println("Remove 5: "+programmingLanguages);

        boolean isRemoved=programmingLanguages.remove("Kotlin");
        System.out.println(isRemoved);

        List<String> scrip=new ArrayList<>();
        scrip.add("Python");
        scrip.add("C");
        programmingLanguages.removeAll(scrip);
        System.out.println(programmingLanguages);

        programmingLanguages.removeIf(n->(n.charAt(0)=='T'));
        System.out.println(programmingLanguages);

        programmingLanguages.clear();
        System.out.println(programmingLanguages);
    }
}
