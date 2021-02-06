import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
    /* 
    Write a program that asks users to enter the radius of a circle and a coordinate point (x, y). 
    Determine whether the point is inside or outside the circle centered at (0, 0).
    */
        Scanner s = new Scanner(System.in);
        double r, x, y, d;
    
        System.out.print("Enter radius of circle : ");
        r = s.nextDouble();
        System.out.print("Enter coordinate x : ");
        x = s.nextDouble();
        System.out.print ("Enter coordinate y : ");
        y = s.nextDouble();
        
        d = (r*r) - Math.pow((0 - x),2) + Math.pow((0 - y),2);
        
        if (d < r) {
            System.out.println("("+x+","+y+")"+" is in the circle.");
        } else {
            System.out.println("("+x+","+y+")"+" is out of the circle.");
        }
    }
    
}
