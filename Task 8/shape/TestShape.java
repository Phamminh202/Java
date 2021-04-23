package shape;

public class TestShape {
    public static void main(String[]args){
        Shape s1=new Rectangle(5,4,"red");
        System.out.println(s1);

        System.out.println("Area is "+s1.getArea());

        Shape s2=new Triangle("blue",4,5);
        System.out.println(s2);
    }
}
