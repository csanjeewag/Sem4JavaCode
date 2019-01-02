
package lab9.Ex2;

public class TestShapes {
    
    public static void main(String[] args){
    
    Sphere sphere = new Sphere();
    Circle circle = new Circle();
    Shapes shape = new Sphere();
    Shapes originalShapes = new Shapes();
    
    System.out.println("The area of Sphere is "+ sphere.getArea(2.1));
    System.out.println("The area of Circle is "+ circle.getArea(2.1));
    System.out.println(circle.getAStatement());
    System.out.println("The area of relevant shape is "+ shape.getArea(2.1));
    System.out.println("The area of original shape is "+ originalShapes.getArea(2.1));
    
    } 
}
