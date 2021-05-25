package loops;
import java.util.Scanner;
// A programme that can provide a factorial of any number given by the user.
public class Factorial {
    public static void main(String[] args) {
        /*
        Factorial Examples
         5! = 5 * 4 * 3 * 2 * 1 ==> 120
         3! = 3 * 2 * 1 ==> 6
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial==>");
        int n = sc.nextInt();
        long factorial = 1;
        for(int i = 1;i<=n;i++){
            factorial *=i;
        }
        System.out.println("The factorial of "+ n +" is: "+ factorial);
    }
}
