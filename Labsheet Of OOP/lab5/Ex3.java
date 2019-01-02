
package lab5;
import java.util.Scanner;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex3 {
       public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    System.out.println("Enter triangle side value");
   int x1= in.nextInt();
   int x2= in.nextInt();
   int x3= in.nextInt();
       if((x1==x2)&&(x2==x3)){
       System.out.println(" triangle is an equilateral");
       }
       else if((x1==x2)||(x2==x3)||(x1==x3)){
       System.out.println(" triangle is an isosceles");
       }
       else{
       System.out.println(" triangle is scalene");
       }
       }
}
