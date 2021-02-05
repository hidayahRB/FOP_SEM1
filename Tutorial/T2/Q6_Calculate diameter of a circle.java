import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        // Finding circumference of circle
        double d,c;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter diameter : ");
        d = keyboard.nextDouble();
        c = d*Math.PI;
        System.out.printf("circumference of circle : %.2f\n", c);
    }
    
}
