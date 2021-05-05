package task1;
import java.util.ArrayList;
import java.util.List;
public class vd7 {
    private String name;
    private int age;
    public vd7(String name,int age){
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

    public void setAge(int age) {
        this.age = age;
    }
}
public class vd7Test{
    public static void main(String[] args){
        List<vd7> user=new ArrayList<>();
        user.add(new vd7("M",20));
        user.add(new vd7("N",19));

        user.forEach(user->{
            System.out.println("Name: "+user.getName()+",Age: "+user.getAge());
        });
    }
}