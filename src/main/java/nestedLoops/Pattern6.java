package nestedLoops;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        int value = 1;
        for(int j=0; j<n;j++){
            for(int k =1;k<(n-j);k++){
                System.out.print("    ");
            }
            for(int i=1; i<=j; i++){
                String newValue = "";
                switch (Integer.toString(value).length()){
                    case 1:
                        newValue = ("  "+value);
                        break;
                    case 2:
                        newValue = (" "+value);
                        break;
                    default:
                        newValue = (value+"");
                }
                System.out.print("  "+newValue+"   ");
                value+=1;
            }
            System.out.println();
        }
    }
}
