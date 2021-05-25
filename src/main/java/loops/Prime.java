package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();
        boolean isPrime = number < 2 ? false : true;
        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println("isPrime: "+isPrime);

    }
}
