package lab6;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        //Write a Java method that returns a triangular number. 
        //A triangular number is defined as 1+2+3+…+ n. 
        //Then, write a Java program to use the method to display the first 20 triangular numbers.
        Scanner scan = new Scanner(System.in);
        System.out.print("parameter : ");
        int max = scan.nextInt();
        returnTriangle(max);
    }
    
    static void returnTriangle(int j){
        int res = 1; 
        for (int i = 2; i <= j+1; i++){
            System.out.print(res+" ");
            res = res + i; //i increases 
        } System.out.println();
    }
}
