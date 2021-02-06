
package lab5;

import java.util.Random;
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        //Write a program that generates 20 random integers within the range from 0 to 100. 
        //Sort the array in descending order. Then, accepts an integer input from the user. 
        //Then, search the array using this number. 
        //Compare the performance of linear search and binary search.
        
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        final int max = 100, min = 0;
        int[] integer = new int[11];
        
        // generate 20 random numbers
        for (int i = 0; i < integer.length; i++) {
            integer[i]=r.nextInt(max-min)+min;
        }
        
        // sort numbers in descending orders in array 
        int temp;
        for (int i = 0; i < integer.length; i++) {
            for (int j = i + 1; j < integer.length; j++) {
                if (integer[i]<integer[j]) {
                    temp = integer[i];
                    integer[i] = integer[j];
                    integer[j] = temp;
                }
            }
        }
        System.out.print("Decsending order : ");
        for (int i = 0; i < integer.length - 1; i++) {
            System.out.print(integer[i]+",");
        }System.out.println(integer[integer.length-1]);
        
        // get an integer from user between (0-100)
        System.out.print("Integer (0-100) : ");
        int search = s.nextInt();
        
        // Linear Search
        int status=0;
        for ( int cnt = 0; cnt < integer.length; cnt++ ){
            if (integer[ cnt ] == search){
                System.out.println("Found "+integer[cnt]+" after "+(cnt+1)+" loop(s)");
                status = 1;
                break;
            }
        }
        if (status == 0) {
            System.out.print("Linear Search : ");
            System.out.println(search+" not found");
        }
        
        // Binary Search
        int result = binarySearch(integer,search);
        if (result == -1) {
            System.out.println(search + " not present");
        } else{
            System.out.println(search + " found at index "+result);
        }
        
    }  

    public static int binarySearch(int[] num, int k) {
        int left = 0, right = num.length -1;
        while(left <= right){
            int mid = 1 + (right - left)/2;
            //check if key is at mid
            if (num[mid] == k) {
                return mid;
            } else if (num[mid] < k) {
                // if key is larger than mid, ignore right half of array
                left = mid - 1;
            } else {
                // if key is smaller than mid, ignore left half of array
                right = mid + 1;
            }
        }
        // if key couldn't be found
        return -1;
    }

}
