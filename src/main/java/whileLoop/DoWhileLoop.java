package whileLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Enter a value: ");
            n = sc.nextInt();
        }while (n > 0);

/*
        while(1>0){
            System.out.print("Enter a value: ");
            n = sc.nextInt();
            if(n==0){
                break;
            }
        }
*/

    }
}
