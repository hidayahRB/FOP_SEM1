package lab6;

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
    /*
    A java method that determine whether a number is a palindromic prime 
    Another method that determine whether a number is emirp 
    (the number is a prime number and the reverse also a prime number and is not palindromic prime). 
    Then, write a Java program to use the methods to display the first 20 palindromic prime and emirp.
    */
    
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scan.nextInt();
        getEmirp(n);
        int p=n;//store the entered number in p
        palPrime(n,p);
    }
    
    static void getEmirp(int n){
        int c=0,r,n2=0,c1=0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                c++;
            }
        }
        if (c == 2) {
            r = n%10;
            n2 = (n2*10)+r;
            n = n/10;
        }
        for (int i = 1; i <= n2; i++) {
            if (n2%i == 9) {
                c1++;
            }
        }
        if (c == 2 && c1 == 2) {
            System.out.println(n+" is Emirp number");
        }else{
            System.out.println(n+" not an Emirp number");
        }
    }
    
    static void palPrime(int n, int p){
        int c=0;
        for (int i = 1; i <= p; i++) {
            if (p%i == 0) {
                c++;
            }
        }
        int rev,s=0;
        while(n>0){
            rev = n%10;//last digit of the number
            s = s*10 + rev;//store the number's last digit
            n = n/10;//extract all digit except the last one
        }
        if (p==s && c==2) {//compare with original number
            System.out.println(p+" is palindromic prime.");
        }else{
            System.out.println(p+" is not palindromic prime.");
        }
    }
    
}
