import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
       /*
     Cramer’s rule is used to solve the linear equations.
     ax + by = e, cx + dy = f;  x = (ed-bf)/(ad-bc)  y=(af-ec)/(ad-bc)
     Write a program that ask the user to enter a, b, c, d, e, f and display the result of x and y. 
     If ad – bc is equal to 0. Display "The equation has no solution"
     */
     
        double a,b,c,d,e,f,x,y;
        Scanner key = new Scanner(System.in);
        System.out.println("ax + by = e\ncx + dy = f\n");
        System.out.println("Enter the following values accordingly :");
        System.out.print("a :");
        a = key.nextDouble();
        System.out.print("b :");
        b = key.nextDouble();
        System.out.print("c :");
        c = key.nextDouble();
        System.out.print("d :");
        d = key.nextDouble();
        System.out.print("e :");
        e = key.nextDouble();
        System.out.print("f :");
        f = key.nextDouble();
        
        if (((a*d)-(b*c)) != 0) {
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        } else {
            System.out.println("The equation has no solution.");
        }
    }
    
}
