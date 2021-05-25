package nestedLoops;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = sc.nextInt();

        /*
        Example is:
         *
         *   *
         *       *
         *   *   *   *
         */
        for(int i=0; i<n; i++){
            for(int j=0;j<=i; j++){
                if(i!=(n-1)){
                    if(j==0 || j==i){
                        System.out.print("*   ");
                    }
                    else{
                        System.out.print("    ");
                    }
                }
                else{
                    System.out.print("*   ");
                }

            }
            System.out.println();
        }
    }
}
