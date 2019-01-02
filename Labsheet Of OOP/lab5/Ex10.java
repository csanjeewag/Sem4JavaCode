package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex10{
    public static void main(String[] args){
    System.out.println("Enter Marks");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
    if(x<70){
        System.out.println("D");
    }
    else if(x<80){
        System.out.println("C");
    }
    else if(x<90){
        System.out.println("B");
    }
    else if(x<=100){
        System.out.println("A");
    }
    else{
    System.out.println("Not valid marks");
    }
    }
}

