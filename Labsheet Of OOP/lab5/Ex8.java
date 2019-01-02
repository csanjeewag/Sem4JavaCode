package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex8 {
    public static void main(String[] args){
    System.out.println("Enter Number1");
    Scanner in = new Scanner(System.in);
   int x1= in.nextInt();
    System.out.println("Enter Number1");
   int x2= in.nextInt();
    if(x1>x2){
        System.out.println(x1+" is > "+x2);
    }
    else if(x1<x2){
        System.out.println(x1+" is < "+x2);
    }
    
    else{
        System.out.println(x1+" = "+x2);
    }
    }
}
