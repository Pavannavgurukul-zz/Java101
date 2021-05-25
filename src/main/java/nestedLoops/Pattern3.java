package nestedLoops;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for(int j=0; j<n;j++){
            for(int i=1; i<=n; i++){
                if(i<=j){
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
