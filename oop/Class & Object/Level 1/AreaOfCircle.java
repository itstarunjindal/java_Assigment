package oop;

public class AreaOfCircle {
    double radius;
    AreaOfCircle(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: "+area);
    }
    public void calculateCircumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle: "+circumference);
    }
    public static void main(String[] args) {
        AreaOfCircle circle = new AreaOfCircle(5.0);
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
