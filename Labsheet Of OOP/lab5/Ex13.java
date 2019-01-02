package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex13 {
    public static void main(String[] args){
    System.out.println("Enter Num");
    Scanner in = new Scanner(System.in);
   int x1= in.nextInt();
    System.out.println("Enter divisible Num");
   int x2= in.nextInt();
    if(x1%x2==0){
        System.out.println(x1+" is divisible from "+x2);
    }
   
    else{
        System.out.println(x1+" is not divisible from "+x2);
    }
    }
}