import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // use the if statement to find the biggest number among three given integers
        // without using arrays
        Scanner s = new Scanner(System.in);
        int num1=0,num2=0,num3=0;
        System.out.println("Enter 3 integers");
        for (int i = 0; i < 3; i++) {
            if (i==0) {
                System.out.print("Integer 1: ");
                num1 = s.nextInt();
            }else if (i == 1) {
                System.out.print("Integer 2: ");
                num2 = s.nextInt();
            }else{
                System.out.print("Integer 3: ");
                num3 = s.nextInt();
            }
        }System.out.println();
        
        if (num1 > num2 && num1>num3) {
            System.out.println(num1+" is the biggest");
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" is the biggest");
        }else{
            System.out.println(num3+" is the biggest");
        }
    }
    
}
