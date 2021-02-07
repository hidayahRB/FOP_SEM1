package lab6;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        //Write a Java method multiPrint(int n, char c) that prints n copies(lines) of character c. 
        //Then, write a Java program to use the method to display the triangles and diamonds.
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Character : ");
        char c = scan.next().charAt(0);
        System.out.print("Copy : ");
        int n = scan.nextInt();
        multiPrint(n,c);
    }
    
    static void multiPrint(int n, char c){
        int space = n - 1; 
        System.out.println(" Triangle :");
        for (int i = 0; i < n; i++) { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++){ 
                System.out.print(" "); 
            }    
            // Print i+1 stars 
            for (int j = 0; j <= i; j++){ 
                System.out.print(c+" "); 
            }
            System.out.print("\n"); 
            space--; 
        } 
        System.out.println("Diamond : ");
        // Repeat "triangle" 
        space = n - 1;//initialize again, if not it will use the previous value
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < space; j++){ 
                System.out.print(" "); 
            }    
            // Print i+1 stars 
            for (int j = 0; j <= i; j++){ 
                System.out.print(c+" "); 
            }
            System.out.print("\n"); 
            space--; 
        } 
        // reverse order(below diamond)
        space = 0; 
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print(" "); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print(c+" "); 
      
            System.out.print("\n"); 
            space++; 
        } 
    }    
}
