package loops;

public class ForLoop {
    public static void main(String[] args) {
        //Print "Hello World" for 10 times'
        /*
        Print hello world for 10 times;
            for(int i = 0;i<100;i=i+2){
                System.out.println((i) + " Hello World!");
            }
        */
        /*
        print all even number from 0 ==> 100;
                for(int i = 0;i<100;i=i+2){
                    System.out.println(i);
                }
        */
        // calculate some of n natural numbers;
        int sum = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);

        // Print reverse counting from 100 = 1;
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }


}

