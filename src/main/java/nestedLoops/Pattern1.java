package nestedLoops;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();

        /*
        Example is:
         *               1
         *   *           2
         *   *   *       3
         *   *   *   *   4
         */
         for(int j=0; j<n; j++){
             for(int i=0;i<=n; i++){
                 if(i<=j){
                     System.out.print("*   ");
                 }
                 else if(i==n){
                     System.out.print(j+1);
                 }
                 else{
                     System.out.print("    ");
                 }
             }
             System.out.println();
         }
    }
}
