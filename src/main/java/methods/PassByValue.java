package methods;

public class PassByValue {
    public static void main(String[] args) {
        int c = 23;
        int d = 25;
        swap(c,d);
        System.out.println("c is: "+c+" d is: "+d);

    }
    static void swap(int a, int b){
        int temp = a;
         b = a;
         a = temp;
    }
}
