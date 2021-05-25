package conditionStatement;

public class NestedIfClass {
    // Define color constants
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";

// Implementation
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 500;
        char result;
        int largestValue;

        if(a>b){
            if(a>c){
                result = 'a';
            }
            else{
                result = 'c';
            }
        }
        else{
            if(b>c){
                result = 'b';
            }
            else{
                result = 'c';
            }
        }

        // Int he similar way, we can use ternary statment for the same task ==>
        largestValue = a>b ? a>c ? a : c :b>c ? b : c;
        System.out.println( TEXT_PURPLE + "The biggest number is: "+ result+": "+largestValue + TEXT_RESET);

    }
}
