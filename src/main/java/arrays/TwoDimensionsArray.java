package arrays;

import java.util.Scanner;

public class TwoDimensionsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[][] marks = {
                {1,2,3,4,5,6},
                {3,7,9,9,0,3},
                {9,3,5,6,7}
        };
        for(int mark: marks[0]) System.out.print(mark+  " ");


    }
}
