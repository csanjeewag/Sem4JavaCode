
package lab5;
import java.util.Scanner;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex2 {
       public static void main(String[] args){
    System.out.println("Enter Year");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
   if(((x%100==0) &&(x%400==0))||((x%100!=0) &&(x%4==0)) )
   {
       System.out.println(x+" is leap year!");
   }
   else {
       System.out.println(x+" is not leap year!");
   }
   
   
       }
}
