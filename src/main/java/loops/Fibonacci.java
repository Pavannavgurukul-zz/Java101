package loops;

import java.util.Scanner;

// This is the programme to print a Fibonacci series by N, and the N is given by the user.
// Example is ==>
// 0 1 1 2 3 5 8 13 24......n
public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of steps: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            int c = a + b;
            System.out.print(a+ " ");
            a=b;
            b=c;
        }

    }
}
