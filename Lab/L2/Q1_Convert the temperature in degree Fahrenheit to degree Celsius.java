import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        // convert the temperature in degree Fahrenheit to degree Celsius
        // display the degree Celsius in two decimal places
        // formula : Celsius = (Fahrenheit – 32) / 1.8
        
        Scanner temp = new Scanner(System.in);
        double f, c;
        System.out.print("Enter Temperature (Farenheit): ");
        f = temp.nextDouble();
        c = (f - 32)/1.8;
        System.out.printf("%.2f degree Celcius\n", c);
    }
    
}
