package lab6;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex7{
    public static void main(String[] args){
    System.out.println("Enter Opereand");
    Scanner in = new Scanner(System.in);
   char y= in.next().trim().charAt(0);
   System.out.println("Enter x1");
   int x1= in.nextInt();
     System.out.println("Enter x2");
   int x2= in.nextInt();
   double z=0;
   switch(y){
 
   case '+':
           z=x1+x2;
           break;
   case '-':
            z=x1-x2;
           break;
   case '*':
            z=x1*x2;
           break;
   case '/':
            z=x1/x2;
           break;
  
    default:
           System.out.println("Invalid operand");
           break;
           
   
          
   
   }
System.out.println(x1+""+y+""+x2+"="+z);
}
}