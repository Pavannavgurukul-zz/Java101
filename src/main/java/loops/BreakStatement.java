package loops;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take user input until he is not giving any negative number;
        for(;;){
            System.out.println("Ener value: ");
            int number = sc.nextInt();
            if(number< 0) break;
        }
    }
}
