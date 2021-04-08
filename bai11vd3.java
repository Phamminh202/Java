public class bai11vd3 {
    public static void main(String[] args){
        Circle c4=new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: "+c4.getRadius());
        c4.setColor();
        System.out.println("color is: "+c4.getColor());

        System.out.println((c4.setRadius(4.0)));
    }
}
