package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex15{
    public static void main(String[] args){
    System.out.println("Enter value");
    Scanner in = new Scanner(System.in);
    int z;
   int x= in.nextInt();
    if(x>=5000){
        z= x*85/100;
        System.out.println("you should pay "+z);
    }
   
    else{
        z=x*90/100;
    System.out.println("You should pay "+z);
    }
    }
}