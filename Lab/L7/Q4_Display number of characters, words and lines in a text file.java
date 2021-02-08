package lab7;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Q4 {

    public static void main(String[] args) throws IOException {
        // Write a program that display the number of characters, words and lines in a text file. 
        // Assume that each word is separated by one space character.
        
        File file = new File("note.txt");
        System.out.println("Content in text file");
        // Count the lines in text file
        int line = ReadLine(file);
        System.out.println("Line(s) : "+line);
        // Count the words and characters in text file
        ReadWordChar(file,line);
        
    }

    public static int ReadLine(File file) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream(file);
        // Read the contents of the file to a byteArray using read()
        byte[] byteArray = new byte[(int)file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] strArray = data.split("\r\n");
        return strArray.length;
    }

    public static void ReadWordChar(File file, int line) throws IOException {
        String[] row = new String[line];
        try{
            Scanner inputStream = new Scanner(new FileInputStream(file));
            // store each content per line in a string array
            for (int i=0; i<row.length; i++) {
                row[i] = Files.readAllLines(Paths.get("note.txt")).get(i);
            }
            inputStream.close();
        }catch (FileNotFoundException e) {
            System.out.println("File was not found"); 
        }
        
        // count words in text file
        int i = row.length-1;
        int occ = 0;
        int ch = 0;
        do{
            String word[] = row[i].split(" ");
            int cnt = ReadCharacter(word);
            occ += word.length;
            ch += cnt;
            i--;  
        }while(i >= 0);
        System.out.println("Word(s) : "+occ);
        System.out.println("Character(s) : "+ch);
    }

    public static int ReadCharacter(String[] word) {
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            char[] strToChar = word[i].toCharArray();
            count += strToChar.length;
        }
        return count;
    }
    
}
