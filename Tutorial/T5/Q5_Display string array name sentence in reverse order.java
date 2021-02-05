import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        // display the string array name sentence in reverse order. 
        // Each string element must be displayed in reverse order as well
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
