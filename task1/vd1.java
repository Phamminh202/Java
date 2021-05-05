package task1;
import java.util.ArrayList;
import java.util.List;

public class vd1 {
    public static void main(String[] args){
        List<String> animal=new ArrayList<>();

        animal.add("Lion");
        animal.add("tiger");
        animal.add("Cat");
        System.out.println(animal);
        animal.add(2,"Dog");
        System.out.println(animal);
    }
}
