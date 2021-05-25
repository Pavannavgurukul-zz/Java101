package conditionStatement;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fist number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operation you want to perform like - add, minus, multiply, or divide");
        sc.nextLine();
        char operation = sc.nextLine().charAt(0);

        switch (operation){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Sorry, this is a invalid operation!");
        }
    }
}
