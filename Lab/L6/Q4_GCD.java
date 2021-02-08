package lab6;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // A method that implements Euclidean Algorithm to return the greatest common divisor of two positive integers. 
        // Then, write a program to get the GCD for (24, 8) and (200, 625).
        
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.print("Integer 1 : ");
        num1 = s.nextInt();
        System.out.print("Integer 2 : ");
        num2 = s.nextInt();
        System.out.println("GCD : "+gcd(num1,num2));
    }

    static int gcd(int num1, int num2) {
        if(num2 == 0){ 
            return num1; 
        } 
        return gcd(num2, num1%num2);// replace to the next round findGCD
    } 
}
