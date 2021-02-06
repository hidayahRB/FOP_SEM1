package lab5;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        //Write a program that randomly generate the seven day work hours (1-8 hours) for N employee. 
        //Then, display the work hours in seven days and the total hours for each employee.
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        
        System.out.print("Number of employee : ");
        int size = s.nextInt();
        System.out.println();
        int[] employee = new int[size];
        int[] day = new int[7];
        int time = 8;
        
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Employee ["+(i+1)+"] : ");
            int sum = 0;
            for (int j = 0; j < day.length; j++) {
                day[j] = r.nextInt(time)+1;
                System.out.printf("day[%d] : %d\n",j,day[j]);
                sum += day[j];//sum of hours for the whole week
            }System.out.println("SUM OF HOURS PER WEEK : "+sum);
            System.out.println();
        }
    }
    
}
