import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        // Write a program that calculates the energy needed to heat water.
        Scanner input = new Scanner(System.in);
        double amount, Initial, Final, Q, M;
        
        System.out.print("Amount of water (g) : ");
        amount = input.nextDouble();
        System.out.print("Initial temperature (F) : ");
        Initial = input.nextDouble();
        System.out.print("Final temperature (F) : ");
        Final = input.nextDouble();
        //convert amount to gram
        //convert F to C
        Initial = (Initial - 32) * 5 / 9;
        Final = (Final - 32) * 5 / 9;
        M = amount/1000;
        Q = M * (Final - Initial) * 4184;
        
        System.out.printf("Energy needed : %.6e \n ", Q);
    }
    
}
