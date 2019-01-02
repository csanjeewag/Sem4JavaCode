package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex9 {
    public static void main(String[] args){
    System.out.println("Enter Number");
    Scanner in = new Scanner(System.in);
   int x1= in.nextInt();
 
    if(x1>0){
        System.out.println(x1+" is > "+0);
    }
    else if(x1<0){
        System.out.println(x1+" is < "+0);
    }
    
    else{
        System.out.println(x1+" = "+0);
    }
    }
}
