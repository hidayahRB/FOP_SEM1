
package lab5;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        // Write a program that used to create Pascal Triangle in the square matrix. 
        // The program will accept an integer from the users and use the integer to create the Pascal Triangle.
        Scanner s = new Scanner(System.in);
        System.out.println("Pascal Triangle");
        System.out.print("Number of row : ");
        int row = s.nextInt();
       
        PrintPascal(row);
    }

    public static void PrintPascal(int row) {
        for (int line = 1; line <= row; line++) {
            int c = 1;
            // if don't want to be in the form of matrix,
            // can switch condition (i <= row) to (i <= line)
            for (int i = 1; i <= row; i++) {
                // the first value in a line must be 1
                System.out.print(c+" ");
                c = c * (line - i) / i;
            }System.out.println();
        }
    }   
}
