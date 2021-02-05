import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        /*Write a program to calculate the monthly payment for car loan. 
        The following are the inputs of the program. 
        Output the monthly payment in two decimal places.
        */
        Scanner keyboard = new Scanner(System.in);
        double p,d,r,y,m;
        /* p = price of the car
           d = down payment
           r = interest rate %
           y = loan duration in year
           m = monthly payment*/
        
        System.out.println("Enter price of the car : ");
        p = keyboard.nextDouble();
        System.out.println("Enter down payment : ");
        d = keyboard.nextDouble();
        System.out.println("Enter interest rate (%): ");
        r = keyboard.nextDouble();
        System.out.println("Enter loan duration");
        y = keyboard.nextDouble();
        
        while(r > 0 && r < 100){
            m = (p-d) * (1 + (r*y/100)) / (y*12);
            System.out.printf("Monthly payment : %.2f\n",m);
        }System.out.println("wrong interest rate entered!");
    }
    
}
