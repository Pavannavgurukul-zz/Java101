package userInput;
import java.util.Scanner;

public class UserInputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String greeting = sc.nextLine();
        System.out.println(greeting);
    }
}
