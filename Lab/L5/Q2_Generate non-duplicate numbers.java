package lab5;

import java.util.Random;

public class Q2 {

    public static void main(String[] args) {
        // Write a program that generates 10 non-duplicate random integers within the range from 0 to 20.
        Random r = new Random();
        int index = 10;
        int[] numArray = new int[index];
        int size = 21;
        int count=0;
        int num;
        
        while(count < numArray.length){
            num = r.nextInt(size);
            boolean repeat=false;
            do{
                for (int i = 0; i < numArray.length; i++) {
                    if (num == numArray[i]) {
                        repeat = true;
                        break;
                        //if not put break, else_if output will also be executed
                    }else if(i == count){
                        numArray[count]=num;
                        count++;
                        repeat = true;
                        break;
                    }
                }
            }while(!repeat);
        }
        System.out.println("10 non-duplicate integers");
        for (int j = 0; j < numArray.length; j++) {
            System.out.print(numArray[j]+" ");
        }System.out.println();
        
    }
    
} 
