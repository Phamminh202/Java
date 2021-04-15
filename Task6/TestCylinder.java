public class TestCylinder {
    public static void main(String []args){
        Cylinder c1=new Cylinder();
        System.out.println("Radius is "+c1.getRadius()
                +",Height is "+c1.getHeight()
                +",Color is "+c1.getColor()
                +",Base ares is "+c1.getArea());

        Cylinder c2=new Cylinder(5.0,2.0);
        System.out.println("Radius is "+c2.getRadius()
                +",Height is "+c2.getHeight()
                +",Color is "+c2.getColor()
                +",Base ares is "+c2.getArea());    }
}
