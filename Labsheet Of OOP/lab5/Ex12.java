package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex12 {
    public static void main(String[] args){
    System.out.println("Enter Selling price");
    Scanner in = new Scanner(System.in);
   int x1= in.nextInt();
    System.out.println("Enter Cost price");
   int x2= in.nextInt();
    if(x1>x2){
        System.out.println(" It is gain");
    }
    else if(x1<x2){
        System.out.println(" It is loss");
    }
    
    else{
        System.out.println(" It is not gain or loss");
    }
    }
}