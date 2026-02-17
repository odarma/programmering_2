package noe.module;
import noe.interfaces.*;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(String color){setColor(color);}

    public abstract double circumference();
    public abstract double area();

    @Override
    public String toString() {
        return String.format("color: %s\ncircumference: %f\narea: %f",
                getColor(),circumference(),area());
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}
}
