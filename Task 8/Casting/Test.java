package Casting;

public class Test {
    public static void main(String[]args){
        A a1=new C();
        System.out.println(a1);
        B b1=(B)a1;
        System.out.println(b1);
        C c1=(C)b1;
        System.out.println(c1);
    }
}
