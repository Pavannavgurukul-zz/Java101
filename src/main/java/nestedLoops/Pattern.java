package nestedLoops;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
        simple star patter for given number by user;
        Example:
         *  *  *  *
         *  *  *  *
         *  *  *  *
         *  *  *  *
        */
        System.out.println("Enter value: ");
        int n = sc.nextInt();

/*
        for(int j=0; j<n; j++){
            for(int i=0;i<n; i++) System.out.print("*   ");
            System.out.println();
        }
*/


        /*
        Second example is:
         *               1
         *   *           2
         *   *   *       3
         *   *   *   *   4
         */
/*
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
*/


/*
        for(int j=1; j<=n; j++){
            for(int i=1;i<=n; i++){
                if(i==1){
                    String newValue = "";
                    int value = j;
                    switch (Integer.toString(value).length()){
                        case 1:
                            newValue = (value+"  ");
                            break;
                        case 2:
                            newValue = (value+ " ");
                            break;
                        default:
                            newValue = (value+"");
                    }
                    System.out.print(newValue);
                }
                if(i<=(n-j)){
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }
*/


        for(int j=0; j<n;j++){
            for(int i=1; i<=n; i++){
                if(i==1){
                    String newValue = "";
                    int value = j+1;
                    switch (Integer.toString(value).length()){
                        case 1:
                            newValue = (value+"  ");
                            break;
                        case 2:
                            newValue = (value+ " ");
                            break;
                        default:
                            newValue = (value+"");
                    }
                    System.out.print(newValue);
                }
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
