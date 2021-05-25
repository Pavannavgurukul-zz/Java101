package conditionStatement;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1,2,3, or 4 to get some output==>");
        int userInput = sc.nextInt();

        switch (userInput){
            case 1:
                //do something here if user gives the input as => 1
                System.out.println("Congratulation, you have selected the fist option ");
                break;
            case 2:
                //do something here if user gives the input as => 2
                System.out.println("Congratulation, you have selected the second option ");
                break;
            case 3:
                //do something here if user gives the input as => 3
                System.out.println("Congratulation, you have selected the third option ");
                break;
            case 4:
                //do something here if user gives the input as => 4
                System.out.println("Congratulation, you have selected the fourth option ");
                break;
            default:
                //do something if any of the case is not exciting
                System.out.println("Sorry, this is not in the options. Please try again!");

        }


    }

}
