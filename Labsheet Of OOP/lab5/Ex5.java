package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex5{
    public static void main(String[] args){
    System.out.println("Enter Value");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
    if(x<100){
        System.out.println("Bill is 3.50");
    }
    else if(x>200){
        System.out.println("Bill is 2.50");
    }
    else if(x>500){
        System.out.println("Bill is 3.50");
    }
    else{
        System.out.println("Bill not issue");
    }
    }
}