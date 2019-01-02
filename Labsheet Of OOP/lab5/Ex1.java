package lab5;
import java.util.Scanner;


/**
 *
 * @author Chanaka Sanjeewa
 */
public class Ex1 {
    public static void main(String[] args){
    System.out.println("Enter Value");
    Scanner in = new Scanner(System.in);
   int x= in.nextInt();
    if(x>60){
        System.out.println("I like Ice cream");
    }
    else if(x>30){
        System.out.println("I like Ice Chocolate");
    }
    else if(x>20){
        System.out.println("I like Ice Apple");
    }
    else{
        System.out.println("i do not like any thing");
    }
    }
}
