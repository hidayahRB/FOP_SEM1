package lab4;

import java.util.Random;

public class Q8 {

    public static void main(String[] args) {
        // generates the first n prime number
        // n is an random integer within 0 to 100
        Random r = new Random();
        final int min=0, max=100;
        int num = r.nextInt(max - min) + min;
        System.out.println("Random integer : "+num);
       
        System.out.println("The first "+num+" prime numbers");
            // prime number can only be divided by itself and 1
            int loop=0; 
            for (int i = 2; loop < num; i++) {
                int count=0;
                for (int j = i; j >= 1; j--) {
                    if (i%j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(i+" ");
                    loop++;
                }
            }System.out.println();     
    }
}
