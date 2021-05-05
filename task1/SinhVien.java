package task1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SinhVien {
    public static void main(String[] args){
        List<String> sv=new ArrayList<>();
        sv.add("A");
        sv.add("B");
        sv.add("C");
        sv.add("D");
        sv.add("E");

        System.out.println("Danh sach sinh vien: "+sv);
        sv.set(4,"M");
        sv.remove(4);
        System.out.println("Danh sach sinh vien sau sua doi: "+sv);

        System.out.println("---Iterator---");
        Iterator<String> svIterator=sv.iterator();
        while (svIterator.hasNext()){
            String s=svIterator.next();
            System.out.println(s);
        }

        System.out.println("---ListIterator---");
        ListIterator<String> svListIterator=sv.listIterator();
        while (svListIterator.hasPrevious()){
            String ss=svListIterator.previous();
            System.out.println(ss);
        }
    }
}
