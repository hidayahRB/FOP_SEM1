package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        //Write the statements that replace each line of a text file with its reverse and save it to a new text file name reverse.txt.
        //store in data.txt
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("original.txt"));
            out.println("Programming I");
            out.println("Data Structure");
            out.println("Operating System");
           
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
        //reverse the lines in original.txt
        //first read the original.txt
        try{
            Scanner in = new Scanner(new FileInputStream("original.txt"));
            System.out.println("From original.txt : ");
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
                //reverse
                try{
                    PrintWriter out = new PrintWriter(new FileOutputStream("reverse.txt"));
                    String[] line = new String[3];
                    for (int i = 0; i < 3; i++) {
                        line[i]= Files.readAllLines(Paths.get("original.txt")).get(i);
                    }
                    //rewrite in reverse.txt
                    for (int i = 2; i >= 0; i--) {
                        out.println(line[i]);
                    }
                    out.close();
                }catch(IOException e){
                    System.out.println("ERROR");
                }
                
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        //read from reverse.txt
        try{
            Scanner in = new Scanner(new FileInputStream("reverse.txt"));
            System.out.println("\nFrom reverse.txt : ");
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
                
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }   
}
