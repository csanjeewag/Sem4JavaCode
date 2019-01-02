package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex14{
    public static void main(String[] args){
    System.out.println("Enter Speed");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
    if(x>50){
        System.out.println("100 pound");
    }
    else if(x>40){
        System.out.println("75 pound");
    }
    else if(x>30){
        System.out.println("50 pound");
    }
   
    else{
    System.out.println("Not fine");
    }
    }
}