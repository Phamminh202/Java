package bai10;

/**
 * Define the child class bai10vd7.java
 */
class bai10vd9 extends bai10vd8{
    float area;

    /**
     * Implement the abstract method to calculate area of circle
     *
     * @param rad a float variable storing value of radius
     * @return void
     */

    @Override
    void calculate(float rad){
        area=getPI()*rad*rad;
        System.out.println("Area of circle is:"+area);
    }
}
/**
 * Define the child class Rectangle.java
 */
class Rectangle extends bai10vd8{
    float perimeter;
    float length=10;
    /**
     * Implement the abstract method to calculate the perimeter
     *
     * @param width a float variable storing width
     * @return void
     */
    @Override
    void calculate(float width){
        perimeter=2*(length+width);
        System.out.println("Perimeter of the Rectangle is:"+perimeter);
    }
}
