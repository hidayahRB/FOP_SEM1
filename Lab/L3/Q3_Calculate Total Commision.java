import java.util.Scanner;

public class Q3 {
    
    public static void main(String[] args) {
        /* 
        Write a program that calculates the total commission receives based on the table below. 
        The program will accept the sales volume and calculate the commission. 
        Display the commission in two decimal places.
        */
        Scanner input = new Scanner(System.in);
        double sale, commision;
        
        System.out.print("Enter sales volume : ");
        sale = input.nextDouble();
        
        if (sale <= 100) {
            commision = sale * 5 / 100;
            System.out.printf("Total commision is RM%.2f", commision);
        } else if (sale > 100 && sale <= 500) {
            commision = sale * (7.5) / 100;
            System.out.printf("Total commision is RM%.2f", commision);
        } else if (sale > 500 && sale <= 1000) {
            commision = sale * 10 / 100;
            System.out.printf("Total commision is RM%.2f", commision);
        } else if (sale > 1000) {
            commision = sale * (12.5) / 100;
            System.out.printf("Total commision is RM%.2f", commision);
        }System.out.println();
    }
    
}
