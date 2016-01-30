/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yani
 */
import javax.swing.JFrame;
public class DrowPanelTest  {

    /**
     * @param args the command line arguments
     */
    public static void main( String args[] )
 {
        
        DrawPanel panel = new DrawPanel();        
        JFrame application = new JFrame();
        
        
        application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        application.add( panel );      
        application.setSize( 250, 250 ); 
        application.setVisible( true );  
        
     } 
}



