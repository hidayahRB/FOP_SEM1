package lab4;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        /*
        Write a program that calculates the minimum, maximum, average and 
        standard deviation (s) of the exam score in a subject. 
        The program will accepts the score and quit if negative score is enter.
        */
        Scanner scan = new Scanner(System.in);
        double x,y=0,min=0,max=0,square=0,sum=0,count=0;
        
        do{
            System.out.print("Enter a score [negative value to quit] : ");
            x = scan.nextInt();
            if (x>0) {
                sum += x;
                square += (x*x);
                if (x<y && x>=0) {
                    min = x;
                }else if (x > max) {
                    max = x;
                }
                y = x;
                ++count;
            }
        }while(x>0);
        
        double a = sum/count;
        double d = square - ((sum*sum)/count);
        double s = Math.sqrt(d/(count-1));
        
        System.out.println("Minimum score : "+min);
        System.out.println("Maximum score : "+max);
        System.out.printf("Average score : %.2f\n",a);
        System.out.printf("Standard deviation : %.2f",s);
    }   
}
