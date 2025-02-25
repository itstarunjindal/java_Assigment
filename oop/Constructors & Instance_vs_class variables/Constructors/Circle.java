package Constructors;

public class Circle {
    private double radius;
    public Circle(){
        this(5.0);
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public void displayArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: "+area);
    }

    public static void main(String[] args) {
        Circle nonP = new Circle();
        Circle p = new Circle(10.0);

        nonP.displayArea();
        p.displayArea();
    }
}
