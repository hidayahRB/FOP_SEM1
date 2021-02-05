import java.util.Random;

public class Q3 {

    public static void main(String[] args) {
        /*Write a program that generates three random numbers. 
        The range of the random number is 10 to 50. 
        Display the three numbers, sum of the numbers and the average in two decimal places.*/
        Random r = new Random();
        final int min = 10;
        final int max = 50;
        int sum = 0;
        
        for (int i = 1; i <= 3; ++i) {
            int num = r.nextInt(max - min + 1)+min;
            System.out.print(num + " ");
            sum += num;
        }
        
        double average = sum/3.0;
        
        System.out.println("\nThe sum of the three random numbers is " + sum);
        System.out.printf("The average of the three random numbers is %.2f\n", average);
    }
    
}
