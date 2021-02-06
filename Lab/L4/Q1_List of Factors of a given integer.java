package lab4;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        /* 
        Write a program that accepts an integer from user. 
        Then, display its entire factors in increasing order.*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        int number = input.nextInt();// positive number
        System.out.print("Factors of " + number + " are: ");

        // loop runs from 1 to inserted number
        for (int i = 1; i <= number; ++i) {
            // if number is divided by i
            // i is the factor iff remainder is 0
            if (number % i == 0) {
            System.out.print(i + " ");
            }
        }System.out.println();
    }   
}
