
import java.awt.Graphics;

/**
 * Title: Lab08 - Java Interfaces
 * 
 * Task: 08_03 TextDrawExample 
 * 
 * Source: 08_03_02_Point.java 
 *
 * @since 2013-05-16
 * @author Milen Petrov
 */
public class Point implements Drawable {
    
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
    }
    

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String toString() {
        return String.format("(%d, %d)", x, y);        
    }
    
    public void drawIt(Graphics g) {
        System.out.println("Изчертава се точка с координати:" + this.toString());
        //g.drawPoint();
    
    }
}
