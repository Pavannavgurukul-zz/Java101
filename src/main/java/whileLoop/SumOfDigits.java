package whileLoop;

import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long number = sc.nextInt();
        long temp = number;
        int sumOfDigis = 0;
        while(temp>0){
            sumOfDigis += (temp % 10);
            temp/=10;
        }
        System.out.println(sumOfDigis);

    }
}
