package lab8;

public class Q1 {

    public static void main(String[] args) {
    // Define a class name Number. The class is used to handle an integer array. 
    // The class Number will display all 
    // the item of the array, the even number, the prime number, 
    // the maximum number, the minimum number, the average, the square number. 
    
        Number a = new Number(); // generate 10 random integers within 0 to 100.
        Number b = new Number(5); // generate 5 random integers within 0 to 100.
        Number c = new Number(4, 50); // generate 4 random integers within 0 to 50.
        
        System.out.println("A");
        a.display();
        a.getEven();
        a.getPrime();
        a.getMaximum();
        a.getMinimum();
        a.getAverage();
        a.getSquare();
        
        System.out.println("\nB");
        b.display();
        b.getEven();
        b.getPrime();
        b.getMaximum();
        b.getMinimum();
        b.getAverage();
        b.getSquare();
        
        System.out.println("\nC");
        c.display();
        c.getEven();
        c.getPrime();
        c.getMaximum();
        c.getMinimum();
        c.getAverage();
        c.getSquare();

    }
    
}

package lab8;

import java.util.Random;

public class Number {
    Random r = new Random();
    private int[] num;
    private int size = 10;
    private int max = 100;
    
    // constructor without arguments
    public Number() {
        num = new int[size];
        generate();
    }
    
    // constructor, arg: size
    public Number(int index) {
        this.size = index;
        num = new int[size];
        generate();
    }
    
    // constructor, arg: (size, max)
    public Number(int index, int largest) {
        this.size = index;
        this.max = largest;
        num = new int[size];
        generate();
    }
    
    public int[] generate(){
        for (int i = 0; i < size; i++) {
            num[i] = r.nextInt(max);
        }
        return num;
    }

    public int[] getGenerate() {
        return generate();
    }
    
    public void display(){
        System.out.print("All numbers : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }System.out.println();
    }
    
    public void getEven(){
        System.out.print("Even : ");
        for (int i = 0; i < num.length; i++) {
            int even = num[i] % 2;
            if (num[i] == 2 || num[i] == 0) {
                System.out.print(num[i]+" ");
            }else if( num[i] != 2 && even == 0){
                System.out.print(num[i]+" ");
            } 
        }System.out.println();
    }
    
    public void getPrime(){
        System.out.print("Prime : ");
        for(int i = 0 ; i < size ; i ++){
            if(isPrime(num[i])){
                System.out.print(num[i] + " ");
            }
        }
        System.out.println();
    }
    private boolean isPrime(int n){
        if(n == 0 )
            return false;
        if(n == 1)
            return false;
        for(int i = 2;  i<= n/2 ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    
    public void getMaximum(){
        int largest = num[0];
        for(int i = 0; i < num.length; i++){
            if( largest < num[i]){
                largest = num[i];
            }
        }System.out.println("Maximum : "+largest);
    }
    
    public void getMinimum(){
        int minimum = num[0];
        for (int i = 0; i < num.length; i++) {
            if (minimum > num[i]) {
                minimum = num[i];
            }
        }System.out.println("Minimum : "+minimum);
    }
    
    public void getAverage(){
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            total += num[i];
        }
        double av = total / num.length;
        System.out.printf("Average : %.2f\n",av);
    }
    
    public void getSquare(){
        double sq;
        System.out.print("Square : ");
        for (int i = 0; i < num.length; i++) {
            sq = Math.sqrt(num[i]);
            
            // check if it is a square number
            if ((sq - Math.floor(sq)) == 0) {
                System.out.print(num[i]+" ");
            }
        }System.out.println();
    }
  
}
