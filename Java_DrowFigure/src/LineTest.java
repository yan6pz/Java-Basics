
/**
 *
 * @author Milen Petrov
 */
public class LineTest {

    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 20);

        Line line1 = new Line(p1, p2);

        System.out.println("p1:" + p1);
        System.out.println("p2:" + p2);
        System.out.println("line1:" + line1);
        
        line1.setEndX(1000);
        
        System.out.println("line1:" + line1);
        
        System.out.println("p2:" + p2);
        
      
        
       
        
        Circle circle1 = new Circle(p2, 50);
        
        
        
    }
}
