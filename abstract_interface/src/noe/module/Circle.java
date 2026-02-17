package noe.module;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        setRadius(radius);
    }

    @Override public double circumference() {return 2*getRadius()*Math.PI;}
    @Override public double area() {return Math.PI*Math.pow(getRadius(),2);}
    @Override public String getDrawing() {return "o";}

    public double getRadius(){return radius;}
    public void setRadius(double radius) {this.radius = radius;}
}
