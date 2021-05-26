package strings;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        /*
          There are lots of this to be learned when it comes to the String
          basically it is a java class which is developed by java developers.
         There are two ways to declare the string
          1. Using string Literals ==> String name = "Pavan";
          2. using new object of the String class. ==> String name = new String("Pavan")
          What is the deference between both of them????
          So, basically the string literals are developed to optimise the memory consumption by the strings.
          It creates a string pool and returns the old string instead of creating new string object and store into the heap memory.
          There are many prebuilt method for string like
          int length();
         */

        String name = "Pavan Vishwkarma";
        String name2 = new String("Pavan Vishwkarma");

        // Check the reference object is same or not
        // This returns false because the name is created into string pool but name2 created into heap memory.
//        System.out.println(name==name2);

        // Check the value of string are equal or not
        System.out.println(name.equals(name2));

        // get the length of any string:
        System.out.println(name.length());

        // Get substring from any string
        // Ether you can give the starting location or you can given both starting and ending location.
        System.out.println(name.substring(0,5));
        System.out.println(name.substring(6));

        // Get one character from any index into the string.
        System.out.println(name.charAt(8));

        // Check if the string is empty or not
        String check = "";
        System.out.println(check.isEmpty());

        // Upend (Concatenate) new string to the existing one
        System.out.println(check.concat("hey"));

        String cars = "Hyundai,Swift,Ferrari,Lamborghini";
        String[] allCars = cars.split(",");
        for(String car : allCars) System.out.print(car+ " ");
        System.out.println();
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.trim());


        System.out.println('a'>'b');
    }
}
