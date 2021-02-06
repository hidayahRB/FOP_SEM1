package lab4;

import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        // Write a program that generates a non-negative random integer. 
        // Display the number of digits in the integer.
        Random r = new Random();
        
        // finalise the minimum number is zero, not -ve number
        final int min = 0, max = 10000;
        
        int num = r.nextInt(max - min) + min;
        System.out.println(num);
        int count = 0;
        
        // count occurence of digits in the number
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
    }
    
}
