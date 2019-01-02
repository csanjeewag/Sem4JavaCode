
package lab6;
import java.util.*;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex5 {
        public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
     System.out.println("Are You Circle=1, rectsngle=2, triangle=3 ");
    int y= in.nextInt();
    double z;
   
  if(y==1) {
  System.out.println("Enter value");
   int x= in.nextInt();
   z=x*2*Math.PI;
   System.out.println("Area = "+z);
  }
  if(y==2) {
  System.out.println("Enter value x1");
   int x1= in.nextInt();
   System.out.println("Enter value x2");
   int x2= in.nextInt();
   z=(x1+x2)*2.0;
   System.out.println("Area = "+z);
  }
   if(y==3) {
  System.out.println("Enter value x");
   int x1= in.nextInt();
  
   z=(x1)*4.0;
   System.out.println("Area = "+z);
  }
    
    }
}
