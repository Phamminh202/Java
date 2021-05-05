package task1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class vd8vd1 {
    public static void main(String[] args){
        List<Integer> numbers=new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);

        System.out.println("Before: "+numbers);

        Collection.sort(numbers);
        System.out.println("Alter: "+numbers);
    }
}
