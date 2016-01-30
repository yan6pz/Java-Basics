
import java.awt.Graphics;

/**
 * Title: Lab08 - Java Interfaces
 * 
 * Task: 08_03 TextDrawExample 
 * 
 * Source: 08_03_04_Circle.java 
 *
 * @since 2013-05-16
 * @author Milen Petrov
 */
public class Circle implements Drawable {

    Point centerPoint;
    int radius;

    public Circle(Point centerPoint, int radius) {
        this.centerPoint = new Point(centerPoint);
        this.radius = radius;
    }

    @Override
    public void drawIt(Graphics g) {
        //System.out.println("Ичертава се окръжност с център" + centerPoint
               // + " и радиус " + this.radius);
        g.drawOval(10, 15, 20, 25);
    }
}
