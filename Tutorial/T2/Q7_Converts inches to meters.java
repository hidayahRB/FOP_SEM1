import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        // converts inches to meters
        Scanner s =new Scanner(System.in);
        double in, m;
        System.out.print("Inch : ");
        in = s.nextFloat();
        //1 inch = 2.54cm = 0.0254m
        m = in*(0.0254);
        System.out.printf("Meter : %.2fm\n",m);
    }
}
