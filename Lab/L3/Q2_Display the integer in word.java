import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        // Generate a random integer within 0 to 5 and display the integer in word.
        Random r = new Random();
        int num;
        int max = 6;
        
        System.out.print("Generate random number : ");
        num = r.nextInt(max);
        System.out.println(num);
        
        switch (num){
            case 0:
                System.out.println(num + " is zero.");
                break;
            case 1:
                System.out.println(num + " is one.");
                break;
            case 2:
                System.out.println(num + " is two.");
                break;
            case 3:
                System.out.println(num + " is three.");
                break;
            case 4:
                System.out.println(num + " is four.");
                break;
            case 5:
                System.out.println(num + " is five.");
                break;
            default:
                break;
         }
    }
    
}
