package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex7 {
    public static void main(String[] args){
    System.out.println("Enter Number");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
    if(x%2==0){
        System.out.println(x+" is even");
    }
  
    else{
        System.out.println(x+" is odd");
    }
    }
}
