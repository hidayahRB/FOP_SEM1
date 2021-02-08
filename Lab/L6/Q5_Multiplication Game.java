package lab6;

import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        //Write a Java method that accepts three parameters, 
        //the method will compare whether the third parameter value is equal to the multiplication of parameter 1 and parameter 2. 
        //Then, write a Java multiplication game for any random number within 0 – 12.
        
        Random r = new Random();
        final int max=12, min=0;
        int[] p = new int[3];
        System.out.println("Parameters");
        // generate three parameters randomly
        for (int i = 0; i < p.length; i++) {
            p[i] = r.nextInt(max-min)+min;
            System.out.println("P["+(i+1)+"] : "+p[i]);
        }System.out.println();
        
        int result = multiplication(p);
        if (result == 1) {
            System.out.println("P[3] is equal to the multiplication of P[1] and P[2]");
        }else{
            System.out.println("P[3] is not equal to the multiplication of P[1] and P[2]");
        }

    }

    static int multiplication(int[] p) {
        int mul = p[0]*p[1];
        if (p[2] == mul) {
            return 1;
        }else{
            return -1;
        }
    }
    
}
