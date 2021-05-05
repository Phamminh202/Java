package task1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class vd5 {
    public static void main(String[] args){
        List<String> tvShows=new ArrayList<>();
        tvShows.add("Breaking");
        tvShows.add("Game");
        tvShows.add("Friends");
        tvShows.add("Prison");

        System.out.println("ForEach:");
        tvShows.forEach(tvShow->{
            System.out.println(tvShow);
        });
        System.out.println("Iterate:");
        Iterator<String> tvShowIterator=tvShows.iterator();
        while (tvShowIterator.hasNext()){
            String tvShow=tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println("List Iterator");
        ListIterator<String> tvShowListIterator=tvShows.listIterator();
        while (tvShowListIterator.hasPrevious()){
            String tv=tvShowListIterator.previous();
            System.out.println(tv);
        }

        System.out.println("ForEach 2");
        for (String tvShow: tvShows){
            System.out.println(tvShow);
        }

        System.out.println("For Loop");
        for (int i=0;i<tvShows.size();i++){
            System.out.println(tvShows.get(i));
        }
    }
}
