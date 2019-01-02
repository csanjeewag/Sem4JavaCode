package lab6;
import java.util.Scanner;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex10 {
       public static void main(String[] args){
            Scanner in = new Scanner(System.in);
    System.out.println("Enter Number");
    Integer n= in.nextInt();
   String x = n.toString();
   int z = x.length();
   System.out.println("Your Number have "+z+" Digits!");
    
       }
}
