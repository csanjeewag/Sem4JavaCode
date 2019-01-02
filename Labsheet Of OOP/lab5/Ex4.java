
package lab5;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Ex4 {
    
      public static void main(String[] args){
  
    Scanner in = new Scanner(System.in);
    System.out.println("Enter charactor");
   char x1= in.next().trim().charAt(0);
   
   if(Character.isLetter(x1))
   {
        System.out.println(x1+" is char");
   }
   else{
   System.out.println(x1+" is not char");
   }
   
  
   
      }
    
}
