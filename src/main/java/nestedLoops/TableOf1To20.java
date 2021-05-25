package nestedLoops;

public class TableOf1To20 {
    public static void main(String[] args) {

        /*
        this is a simple example for the nestedLoops
                for(int j = 0; j < 5; j++){
                    for(int i=1;i<=10;i++){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
        */

        //This is a solution to print complete table from 2 to 10;
        for(int j = 1; j <= 10; j++){
            for(int i=2;i<=20;i++){
                int value = i*j;
                String newValue = "";
                switch (Integer.toString(value).length()){
                    case 1:
                        newValue = ("  "+value);
                        break;
                    case 2:
                        newValue = (" "+value);
                        break;
                    default:
                        newValue = (""+value);
                }
                System.out.print(newValue+ "  ");
            }
            System.out.println();
            System.out.println();
        }

    }
}
