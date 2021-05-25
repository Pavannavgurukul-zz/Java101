package conditionStatement;

public class IfElseClass {
    public static void main(String[] args) {
        int number = 0;
        if(number<=10) {
            System.out.println("The number is less then or equal to 10 ");
        }
        else if(number >10 &&number<=20){
            System.out.println("The number is between 11-20");
        }
        else if(number>20 && number <=30){
            System.out.println("The number is between 21-30");
        }
        else {
            System.out.println("The number is greater then 30");
        }

        //This is one example of ternary operator if-else statement
        int a = 4;
        int b = 20;
        char maxOfBoth = a > b ? 'a' : 'b';
        System.out.println("The max number of both is: " + maxOfBoth);
    }
}
