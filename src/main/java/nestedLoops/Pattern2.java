package nestedLoops;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        for(int j=1; j<=n; j++){
            for(int i=1;i<=n; i++){
                if(i==1){
                    String newValue = "";
                    int value = j;
                    switch (Integer.toString(value).length()){
                        case 1:
                            newValue = (value+"  ");
                            break;
                        case 2:
                            newValue = (value+ " ");
                            break;
                        default:
                            newValue = (value+"");
                    }
                    System.out.print(newValue);
                }
                if(i<=(n-j)){
                    System.out.print("   ");
                }
                else{
                    System.out.print("*  ");
                }

            }
            System.out.println();
        }
    }
}
