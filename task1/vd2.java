package task1;
import java.util.ArrayList;
import java.util.List;

public class vd2 {
    public static void main(String[] args){
        List<Integer>firstFivePrimeNumber=new ArrayList<>();
        firstFivePrimeNumber.add(2);
        firstFivePrimeNumber.add(3);
        firstFivePrimeNumber.add(5);
        firstFivePrimeNumber.add(7);
        firstFivePrimeNumber.add(11);

        List<Integer> firstTenPrimeNumbers=new ArrayList<>(firstFivePrimeNumber);
        List<Integer> next=new ArrayList<>();
        next.add(13);
        next.add(17);
        next.add(19);

        firstTenPrimeNumbers.addAll(next);
        System.out.println(firstTenPrimeNumbers);
    }
}
