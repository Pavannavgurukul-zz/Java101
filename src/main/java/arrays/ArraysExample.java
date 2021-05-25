package arrays;

import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        for(int i=0; i<n;i++){
            System.out.print("Enter the marks: ");
            marks[i] = sc.nextInt();
        }
        int ave = 0;
        int sum = 0;
        for (int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }

        System.out.println(sum/n);
        for (int mark : marks) System.out.print(mark + " ");


    }
}
