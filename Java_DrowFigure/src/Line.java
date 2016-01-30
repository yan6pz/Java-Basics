
import java.awt.Graphics;

/**
 * Title: Lab08 - Java Interfaces
 * 
 * Task: 08_03 TextDrawExample 
 * 
 * Source: 08_03_03_Line.java 
 *
 * @since 2013-05-16
 * @author Milen Petrov
 */
public class Line extends Point implements Drawable {
//    int x2;
//    int y2;
        
    Point endPoint;
    
    public Line(int x1, int y1, int x2, int y2) {
        super(x1, y1);
//        this.x2 = x2;
//        this.y2 = y2;
        endPoint = new Point(x2, y2);
    }
    
    public Line(Point startPoint, Point endPoint) {
        super(startPoint);        
//        this.endPoint = endPoint;
        this.endPoint = new Point(endPoint);//= endPoint;        
    }
    
    public void setEndX(int x) {
        endPoint.setX(x);
    }
    
    public void setStartX(int x) {
        super.setX(x);
    }
    
    public String toString() {
        
        return String.format("[%s; %s]", super.toString(), endPoint);
    }
    
    public void drawIt(Graphics g) {
        System.out.println("Изчертава се отсечка с координати:" + this.toString());
    }
}
