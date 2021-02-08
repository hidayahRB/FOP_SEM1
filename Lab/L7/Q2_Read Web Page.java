package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        // Write the contents of the Web page into a text file name index.htm.
        
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter outputStream = new PrintWriter (new FileOutputStream("index.htm"));
            while(in.hasNextLine()){
                String line = in.nextLine();
                String [] words = line.split(" ");
                for(int i = 0 ; i < words.length ; i++){

                }
                outputStream.println(in.nextLine());
            }

            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }   
}
