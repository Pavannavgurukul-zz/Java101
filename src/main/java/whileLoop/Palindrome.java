package whileLoop;

import java.util.Scanner;
// This is a programme to fine the given number is a palindrome number or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long number = sc.nextInt();
        long temp = number;
        boolean isPalindropm;

/*
    //Here I am finding the palindrome using string conversion and conciliating.
        String reverse = "";
        while(temp>0){
            reverse += temp%10;
            temp/=10;
        }
        isPalindrome = number == Integer.parseInt(reverse);
        System.out.println(isPalindrome);
*/
        int reverse = 0;
        while(temp>0){
            reverse = (reverse * 10) + ((int) temp % 10);
            temp /= 10;
        }
        isPalindropm = (number == reverse);
        System.out.println(isPalindropm);
    }
}
