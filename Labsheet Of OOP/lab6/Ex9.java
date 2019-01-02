package lab6;
import java.util.Scanner;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex9 {
       public static void main(String[] args){
            Scanner in = new Scanner(System.in);
    System.out.println("Enter Number");
    int y= in.nextInt();
   
    switch(y){
        case 11:System.out.println("Delhi"); break;
        case 22:System.out.println("Mumbai"); break;
        case 33:System.out.println("Kolkata"); break;
        case 44:System.out.println("Chennai"); break;
        default:System.out.println("Code not valid"); break;
    }

   }
  
}