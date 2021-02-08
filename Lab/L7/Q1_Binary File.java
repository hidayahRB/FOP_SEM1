package lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) throws IOException {
        // A program that store the table below in a binary file name coursename.dat.
        // Then, ask the users to enter a course code. 
        // The program will display the course name from coursename.dat.
        
        Scanner s = new Scanner(System.in);
        String code;
        System.out.print("Course Code : ");
        code = s.nextLine();
        
        //store in data.txt
        try{
            PrintWriter out = new PrintWriter(new FileOutputStream("coursename.dat"));
            out.println("Programming I");
            out.println("Data Structure");
            out.println("Operating System");
            out.println("Computing Mathematics I");
            out.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        
        //read and print
        //read in data.txt
        try{
            Scanner in = new Scanner(new FileInputStream("coursename.dat"));
            System.out.println("\nFrom coursename.dat : ");
            while (in.hasNextLine()) {
                if (code.equalsIgnoreCase("WXES1116")) {
                    String line0 = Files.readAllLines(Paths.get("coursename.dat")).get(0);
                    System.out.println(line0);
                    break;
                }else if (code.equalsIgnoreCase("WXES1115")) {
                    String line1 = Files.readAllLines(Paths.get("coursename.dat")).get(1);
                    System.out.println(line1);
                    break;
                }else if (code.equalsIgnoreCase("WXES1110")) {
                    String line2 = Files.readAllLines(Paths.get("coursename.dat")).get(2);
                    System.out.println(line2);
                    break;
                }else if (code.equalsIgnoreCase("WXES1112")) {
                    String line3 = Files.readAllLines(Paths.get("coursename.dat")).get(3);
                    System.out.println(line3);
                    break;
                }else{
                    System.out.println("Wrong course code.");
                    break;
                }
                
            }
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }   
}
