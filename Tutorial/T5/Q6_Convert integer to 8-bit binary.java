import java.util.Random;

public class Q6 {

    public static void main(String[] args) {
        // Generate 1 random integer within 0 – 255. 
        // Convert the number to binary and store the bit into an 8 bit array. 
        // Then, display the binary number.
        Random r = new Random();
        int num = r.nextInt(256);
        // 8-bit
        String result="00000000";
        
        int i = result.length()-1;
        System.out.println("Number : "+num);
        
        while(num != 0){
            char a[] = result.toCharArray();
            a[i--]= String.valueOf(num%2).charAt(0);
            result = new String(a);
            num = num/2;
        }System.out.println("Binary : "+result);
    }
    
}
