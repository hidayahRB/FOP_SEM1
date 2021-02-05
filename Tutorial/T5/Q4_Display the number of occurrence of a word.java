import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.
        Scanner s = new Scanner(System.in);
        String word = "the";
        System.out.print("String : ");
        String line = s.nextLine();
        //split line by spaces
        String a[] = line.split(" ");
        // count occ
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i])) {
                count++;
            }
        }System.out.println("Occurence of \"the\" : "+count);
    }
    
}
