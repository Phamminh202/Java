package task1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.List;

public class vd8vd3 {
    private String name;
    private Integer age;
    public vd8vd3(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String toString(){
        return "{"+"name="+name+'\''+", age="+age+"}";
    }
}

public class ArrayListObjectSortExample{
    public static void main(String[] args){
        List<vd8vd3> people=new ArrayList<>();
        people.add(new vd8vd3("Xiao",20));
        people.add(new vd8vd3("qiqi",18));
        people.add(new vd8vd3("mmm",19));

        System.out.println("Person List: "+people);
        people.sort((people1,people2)->{
            return people1.getAge()- people2.getAge();
        });

        people.sort(Comparator.comparingInt(vd8vd3::getAge));
        System.out.println("Sorted by age:"+people);
        Collection.sort(people,Comparator.comparing(vd8vd3::getName));
        System.out.println("Sorted by Name: "+people);
    }
}
