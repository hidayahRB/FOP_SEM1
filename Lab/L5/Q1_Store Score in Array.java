package lab5;

import java.util.Random;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        //Write a program to randomly generate N student scores (0-100). 
        //User enter N students and store the score in an array. 
        //Then display a list of score, the highest, lowest and average score.
        Random r = new Random();
        Scanner s = new Scanner(System.in);
    
        int size = 101;//student score
        int student;
        System.out.print("Number of student : ");
        student = s.nextInt();
    
        int[] score = new int[student];
        for (int i = 0; i < score.length; i++) {
            System.out.print("Student["+(i+1)+"] : ");
            score[i] = r.nextInt(size);
            System.out.println(score[i]);
        }
        
        int minValue = score[0];//declare and initialize first the minimum value
        for (int i = 1; i < score.length; i++) {
            if (score[i] < minValue) {
                minValue = score[i];
            }
        }System.out.println("Min number : "+minValue);
        
        int maxValue = score[0];
        for (int i = 1; i < score.length; i++) {
            if (score[i] > maxValue) {
                maxValue = score[i];
            }
        }
        System.out.println("Max number : "+maxValue);
        
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];  
        }
        double av = sum/student;
        System.out.println("Total score : "+sum);
        System.out.printf("Average score: %.2f\n",av);
    }
    
}
