package lab6;

import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        // Accepts an array of 10 integers. 
        // The method should reverse the integer in the array. 
        // Example, if the number is 1234, the number will change to 4321.
        
        Random r  =new Random();
        int[] num = new int[10];
        final int min = 0, max = 1000;
        System.out.println("Enter integer");
        for (int i = 0; i < num.length; i++) {
            System.out.print("["+i+"] : ");
            num[i] = r.nextInt(max - min) + min;
            System.out.println(num[i]);
        }
        
        reverseInteger(num);
    }

    public static void reverseInteger(int[] num) {
        System.out.println("\nReversed");
        for (int i = 0; i < num.length; i++) {
            int reversed = 0;
            //count number of digit in a number
            System.out.print("["+i+"] : ");
            while(num[i] != 0) {
                int digit = num[i] % 10;
                System.out.print(digit);
                reversed = reversed * 10 + digit;
                num[i] /= 10;
            }
            System.out.println();
        }
    }   
}
