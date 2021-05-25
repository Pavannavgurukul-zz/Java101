package oprators;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 13;
        int b = 15;

        int c = (a * a) + (b * b) + (2 * a * b);
        int d = (a + b) * (a + b);


//        int e = (int)((double) a / (double) b);
        double e = (double)a % (double) b;
//        System.out.println("The hole squire of "+ a + " and " + b+  " is: "+ d);
        System.out.println(e);

    }
}
