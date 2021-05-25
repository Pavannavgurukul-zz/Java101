package arrays;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns for the matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        System.out.println();
        int[][] m1 = new int[rows][cols];
        int[][] m2 = new int[rows][cols];
        int[][] addition = new int[rows][cols];
        int number = 1;

        System.out.println("Enter the values for first matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the values for second matrix: ");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                int m1Value = m1[i][j];
                int m2Value = m2[i][j];
                addition[i][j] = m1Value+m2Value;
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }


    }
}
