import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        /*Write a program that generates one random number. 
        The range of the random number is 0 to 10000. 
        Display the number and the sum of all the digits in the number.
        */
        Random r = new Random();
        int num, digit, i;
        int MAX = 10001;
        int sum = 0;
        
        num = r.nextInt(MAX);
        digit = num;
        
        while (digit > 0){
            i= digit % 10;
            sum = sum + i;
            digit = digit / 10;
        } 
        
        System.out.println(num);
        System.out.println(sum);
    }
    
}
