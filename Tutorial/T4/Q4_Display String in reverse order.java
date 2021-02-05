import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // Display String in reverse order
        Scanner s = new Scanner(System.in);
        System.out.print("String : ");
        String line = s.nextLine();
        
        // getBytes() method to convert String into bytes[]
        byte[] strByteArray = line.getBytes();
        byte[] result = new byte[strByteArray.length];
        
        //sort the strByteArray in reverse order
        for (int i = 0; i < strByteArray.length; i++) {
            result[i] = strByteArray[strByteArray.length - i - 1];
        }System.out.println(new String(result));
    }
}
