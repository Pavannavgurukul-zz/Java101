package oprators;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;

        /*
         ==> Here are some examples of the Assignment Operators also.
         a += b; This line is like a = a + b; ==> 11
         a &= b; This means a = a & b; ==> 4
         a |= b; This means a = a & b; ==> 7
        */
        int andOperator = a & b;
        int orOperator  = a | b;
        System.out.println(andOperator + " " + orOperator);
    }
}
