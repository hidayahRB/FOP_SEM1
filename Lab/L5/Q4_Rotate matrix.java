package lab5;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        // Write a program that rotates 90 degrees clockwise a 3 by 3 matrix.
        Scanner s = new Scanner(System.in);
        int row = 3;//can make it dynamic for other value of row and column
        int column = 3;
        int[][] matrix = new int[row][column];
    
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("Enter [%d][%d] integer :",i,j);
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("3 by 3 Matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
        
        System.out.println("After rotates 90 degree clockwise : ");
        
        // change one-by-one code
        //newmatrix[0][0] = matrix[2][0];
        //newmatrix[0][1] = matrix[1][0];
        //newmatrix[0][2] = matrix[0][0];
        //newmatrix[1][0] = matrix[2][1];
        //newmatrix[1][1] = matrix[1][1];
        //newmatrix[1][2] = matrix[0][1];
        //newmatrix[2][0] = matrix[2][2];
        //newmatrix[2][1] = matrix[1][2];
        //newmatrix[2][2] = matrix[0][2];
        
        // after observing the changing pattern, use for loop 
        // dynamic code
        int col=2;
        int[][] newmatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= col; j++) {
                newmatrix[i][j] = matrix[col-j][i];
            }
        }
        // display the new matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(newmatrix[i][j]+" ");
            }System.out.println();
        }
    }   
}
