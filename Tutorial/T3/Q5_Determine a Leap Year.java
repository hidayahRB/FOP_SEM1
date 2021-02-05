import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // Determine Leap Year
        Scanner s = new Scanner(System.in);
        int y=0;
        System.out.print("Year : ");
        y = s.nextInt();
        //A Leap year is divisible by 4 but not by 100.
        //However, a Leap year is also divisible by 400.
        if (y%4 == 0) {
            if(y%100!=0){
                System.out.println(y+" is a leap year");
            }else if (y%400 == 0) {
                System.out.println(y+" is a leap year");
            }
        }else{
            System.out.println(y+" is not a leap year");
        }
    }
    
}
