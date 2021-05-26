package strings;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter strings to check if they are anagram of each other: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean isAnagram = true;

        int[] ascii = new int[256];

        if(a.length() == b.length()){
            for(char c : a.toCharArray()){
                int index = (int) c;
                ascii[index]++;
            }
            for(char c : b.toCharArray()){
                int index = (int) c;
                ascii[index]--;
            }
            for(int value : ascii){
                if(value != 0){
                    isAnagram = false;
                    break;
                };
            }
        }
        else{
            isAnagram = false;
        }
        System.out.println(isAnagram);
        int asc = 'a';
        System.out.println(asc);

    }
}
