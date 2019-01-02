package lab6;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex6{
    public static void main(String[] args){
    System.out.println("Enter Grade");
    Scanner in = new Scanner(System.in);
   char x= in.next().trim().charAt(0);
   switch(x){
 
   case 'A':
           System.out.println("Excellent");
           break;
   case 'B':
           System.out.println("Well Done");
           break;
   case 'C':
           System.out.println("Well Done");
           break;
   case 'D':
           System.out.println("You Pass");
           break;
   case 'F':
           System.out.println("Better Try Again");
           break;
    default:
           System.out.println("Invalid Grade");
           break;
   
          
   
   }

}
}