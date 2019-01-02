package lab6;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex2{
    public static void main(String[] args){
    System.out.println("Enter char");
    Scanner in = new Scanner(System.in);
   char x= in.next().trim().charAt(0);
   switch(x){
 
   case 'a':case 'e':case 'i':case 'o':case 'u':
       System.out.println("It is vowels");
           break;
    default:
           System.out.println("Not valid");
           break;
   
          
   
   }

}
}