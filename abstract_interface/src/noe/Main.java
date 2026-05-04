package noe;
import noe.interfaces.Drawable;
import noe.module.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("blue",23,23);
        Circle circle = new Circle("green",7);

        System.out.printf("---rectangle---\n%s\n\n---circle---\n%s",
                rectangle,circle);

        System.out.println(rectangle.getDrawing());
        System.out.println(circle.getDrawing());

        Drawable drawable = new Rectangle("yellow",13,4);
        System.out.println(drawable);

        ArrayList<Figure> figureList = new ArrayList<>();
        figureList.add(circle);
        figureList.add(rectangle);
        figureList.add(new Circle("Cyan", 0.4));

        System.out.println("\n---Unsorted list---");
        for (Figure figure : figureList) {
            System.out.println(figure);
            System.out.println();
        }

        Collections.sort(figureList);

        System.out.println("\n---Sorted list---");
        for (Figure figure : figureList) {
            System.out.println(figure);
            System.out.println();
        }
    }
}

