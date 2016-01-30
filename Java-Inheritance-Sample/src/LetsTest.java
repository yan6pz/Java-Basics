/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */
public class LetsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       People person = new People();
       Student student1=new Student();
      System.out.println(person.toString());
      System.out.println(student1.toString());
      System.out.println(student1.getInfo());
    }
}
