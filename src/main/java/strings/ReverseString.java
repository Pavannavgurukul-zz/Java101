package strings;

public class ReverseString {
    public static void main(String[] args) {
        String a = "I love                     Java,              the                 coffee";
        String[] words = a.split(" ");
        int n = words.length;
        String reverseString = "";

        System.out.println(n);
        for(String word : words){
            System.out.print(word.trim());
        }

    }
}
