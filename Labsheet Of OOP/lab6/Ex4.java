
package lab6;
import java.util.*;
/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex4 {
        public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
     System.out.println("Are You Member? ");
    int y= in.nextInt();
    System.out.println("Enter value");
    int z;
   int x= in.nextInt();
   
    if((x>=5000)&&(y==1)){
        z= x*85/100;
        System.out.println("you should pay "+z);
    }
   
    else if(y==1){
        z=x*90/100;
    System.out.println("You should pay "+z);
    }
    else if(x>5000){
        z=x*93/100;
    System.out.println("You should pay "+z);
    }
    else {
    System.out.println("You should pay "+x);
    }
    }
}
