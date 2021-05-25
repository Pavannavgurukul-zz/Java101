package nestedLoops;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for(int j=0; j<n;j++){
            for(int i=1; i<=n-j; i++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
