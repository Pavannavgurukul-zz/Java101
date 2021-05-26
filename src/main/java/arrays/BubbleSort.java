package arrays;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] toSort = new int[n];

        System.out.println("Enter the array to get sorted: ");
        for(int i=0; i<n; i++){
            toSort[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            boolean sorted = true;
            for(int j=0; j<(n-1-i); j++){
                if(toSort[j] > toSort[j+1]){
                    int temp = toSort[j+1];
                    toSort[j+1] = toSort[j];
                    toSort[j] = temp;
                    sorted = false;
                }
            }
            if(sorted) break;
        }

        for(int number : toSort){ System.out.print(number + " ");}
    }
}
