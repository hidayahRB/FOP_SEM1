import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
       /* Write a program that stimulates a simple calculator. It reads two integers and a character. 
       If the character is a +, the sum is printed; 
       if it is a -, the difference is printed; 
       if is a *, the multiplication is printed;
       if it is a /, the quotient is printed; 
       if it is a %, the remainder is printed. 
       (Use the String.charAt(0) to return the character)
        */  
        Scanner input = new Scanner(System.in);
        int num1, num2, ans;
    
        System.out.print("Integer 1 : ");
        num1 = input.nextInt();
        System.out.print("Integer 2 : ");
        num2 = input.nextInt();
        
        String ch = "+-*/%";
        char ch1 = ch.charAt(0);
        char ch2 = ch.charAt(1);
        char ch3 = ch.charAt(2);
        char ch4 = ch.charAt(3);
        char ch5 = ch.charAt(4);
        
        System.out.println("+ : sum\n- : difference\n* : multiplication\n/ : quotient\n% : remainder");
        System.out.print("\nChoose Operation :");
        char operand = input.next().charAt(0);
        
        if (operand == ch1) {
            ans = num1 + num2;
            System.out.println(num1+""+operand+""+num2+"="+ans);
        } else if (operand == ch2) {
            ans = num1 - num2;
            System.out.println(num1+""+operand+""+num2+"="+ans);
        } else if (operand == ch3) {
            ans = num1 * num2;
            System.out.println(num1+""+operand+""+num2+"="+ans);
        } else if (operand == ch4) {
            ans = num1 / num2;
            System.out.println(num1+""+operand+""+num2+"="+ans);
        } else if (operand == ch5) {
            ans = num1 % num2;
            System.out.println(num1+""+operand+""+num2+"="+ans);
        } else{
            System.out.println("wrong operand.");
        }
    }
    
}
