package userInput;
import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please Enter principle =>");
        int principal = sc.nextInt();
        System.out.println("Please Enter rate =>");
        float rate = sc.nextFloat();
        System.out.println("Please Enter months =>");
        int time = sc.nextInt();

        double simpleIntrest = principal * rate * time / 100;
        System.out.println("The simple intrest is: "+ simpleIntrest);
    }
}
