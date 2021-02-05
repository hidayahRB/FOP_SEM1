import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // Write a program that converts the seconds to hours, minutes and seconds
        Scanner r = new Scanner(System.in);
        int sec, hour, min, finalsec;
        System.out.print("Enter seconds : ");
        sec = r.nextInt();
        
        //finding hours
        // using '/' will give answer from the left side of the decimal
        hour = sec/3600;
        //finding remaining hours
        int rhour = sec - (hour*3600);
        //finding minutes
        min = rhour/60;
        //finding remaining minutes
        int rmin = rhour - (min*60);
        //finding seconds
        finalsec = rmin;
        System.out.print(sec+" second(s) is ");
        System.out.print(hour + "hours ");
        System.out.print(min + "minutes ");
        System.out.println(finalsec + "seconds");
    }
    
}
