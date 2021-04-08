public class bai11vd1 {
    private  double radius;
    private String color;

    public Circle(){
        radius=1.0;
        color="red";
    }
    public Circle(double r){
        radius=r;
        color="red";
    }
    public Cricle(double r;String c){
        radius=r;
        color=c;
    }

    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
}
