import java.awt.Graphics; 
import java.awt.Polygon;
import javax.swing.JPanel;

public class DrawPanel 
    extends JPanel {
    
    public DrawPanel()
    {
        super();
    }

    public void paintComponent ( Graphics g )
    {      
        super.paintComponent( g );        
        int width = getWidth(); // total width
        int height = getHeight(); // total height
        g.drawLine(0,0,width,height);
        Line line=new Line(10,15,20,25);
        Point point =new Point(5,10);
        Point point2=new Point(60,40);
        Rectangle rec=new Rectangle(point,point2);
        g.drawLine(10,15,50,60);
        rec.drawIt(g);
        int [] xPoints={1,2,3,4,5,6};
        int [] yPoints={10,20,30,40,50,60};
        g.drawPolyline(xPoints, yPoints, 6);
        
        
    }
}
