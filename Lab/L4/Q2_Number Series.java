package lab4;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        //Write a program that accepts an integer n from user and then sum the following series.
        //1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
        Scanner s = new Scanner(System.in);
        int num,sum1=0,sum2=0;
        
        System.out.print("Enter number : ");
        num = s.nextInt();
        
        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                sum1 += i;
                sum2 += sum1; 
            }System.out.println("Sum = "+sum2);
        }else{
            System.out.println("Sum = 0");
        }
    }
    
}
