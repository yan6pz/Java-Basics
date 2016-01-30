
import java.awt.Graphics;


/**
 * Title: Lab08 - Java Interfaces
 * 
 * Task: 08_03 TextDrawExample 
 * 
 * Source: 08_03_05_Rectangle.java 
 *
 * @since 2013-05-16
 * @author Milen Petrov
 */
public class Rectangle implements Drawable {

    Point upperLeft;
    Point lowerRight;

    public Rectangle(Point p1, Point p2) {
        upperLeft = new Point(p1);
        lowerRight = new Point(p2);
    }

    @Override
    public void drawIt(Graphics g) {
       /* System.out.println("Изчертава се правоъгълник с начална точка " + upperLeft.toString()
                + " и височина " + (lowerRight.getY() - upperLeft.getY()) + " и широчина "
                + (lowerRight.getX() - upperLeft.getX()));*/
        g.drawRect(10,20,40,20);
    }
}
