package lab6;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex1{
    public static void main(String[] args){
    System.out.println("Enter value");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
   switch(x){
 
   case 20:
           System.out.println("I like Ice cream");
           break;
   case 30:
           System.out.println("i like chocolate");
           break;
   case 60:
           System.out.println("I like apple");
           break;
   
    default:
           System.out.println("Not valid");
           break;
   
          
   
   }

}
}