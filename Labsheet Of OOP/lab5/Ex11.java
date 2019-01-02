package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex11{
    public static void main(String[] args){
    System.out.println("Enter Day");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
   switch(x){
 
   case 1:
           System.out.println("Monaday");
           break;
   case 2:
           System.out.println("Tuesday");
           break;
   case 3:
           System.out.println("Wendsday");
           break;
   case 4:
           System.out.println("Thurday");
           break;
   case 5:
           System.out.println("Friday");
           break;
   case 6:
           System.out.println("Saturday");
           break;
    case 7:
           System.out.println("Sunday");
           break;
    default:
           System.out.println("Not valid");
           break;
   
          
   
   }

}
}