package lab6;
import java.util.Scanner;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex8 {
       public static void main(String[] args){
            Scanner in = new Scanner(System.in);
    System.out.println("Enter Year");
    int x= in.nextInt();
    
     System.out.println("Enter month");
    int y= in.nextInt();
    
   if(((x%100==0) &&(x%400==0))||((x%100!=0) &&(x%4==0)) )
   {   
      int[] arr={31,29,31,30,31,30,31,31,30,31,30,31};
      System.out.println("Number of Month "+arr[y-1]);
   }
   else {
       int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
       System.out.println("Number of Month "+arr[y-1]);
   }
   
   
   
       }
}
