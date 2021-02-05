public class Q3 {

    public static void main(String[] args) {
        // Display 10 Fibonacci Sequence
        // formula f1 = 1, f2 =1, fn = f(n-1) + f(n-2).
        // f3 = f2 + f1,
        // f4 = f3 + f2,
        
        int f1=0,f2=1,sum;
        System.out.println("10 Fibonacci Sequence");
        for (int i = 0; i < 10; i++){
            System.out.print(f1+" ");
            sum = f2+f1;
            f1 = f2;
            f2 = sum;
        }   
    }   
}
