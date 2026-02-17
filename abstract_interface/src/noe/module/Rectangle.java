package noe.module;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        setLength(length);
        setWidth(width);
    }

    @Override public double circumference() {return (2*getLength())+(2*getWidth());}
    @Override public double area() {return getLength()*getWidth();}
    @Override public String getDrawing() {return "\n______\n|    |\nTTTTTT\n";}

    public double getLength() {return length;}
    public void setLength(double length) {this.length = length;}
    public double getWidth() {return width;}
    public void setWidth(double width) {this.width = width;}
}
