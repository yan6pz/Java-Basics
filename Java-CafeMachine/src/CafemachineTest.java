
public class CafemachineTest {
    
    
    public static void main(String[] args){
    Cafemachine machine1=new Cafemachine();
    Cafemachine machine2=new Cafemachine(1,1,2,3,4,5,7);
    System.out.println(" Number of coins with value 0ne"
            +machine1.getBr1st());//edin ot principite na oop
    System.out.println(" Systoqnie na monetite v mashinata:"
            +machine1.toString());
    System.out.println(
            machine1.takeResto(150));
    }
}
