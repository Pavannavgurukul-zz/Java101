package methods;

/*
 Basically methods are very similar to functions into c or another programming language.
 Main thing with java is the execution of the program.
 There is a flow at the fist point the compiler will find the public class into the file and the it will find the main method
 Main method having it's own convention to write and what parameters needs to be passed.
 The execution of code will start from the main method only;
*/
public class Introduction {

    /*
    Method Overloading ==>
    When a class has two or more methods with same name but different signature* it called method overloading.
                                            *Signatures are basically passed argument with datatype sensitive.

     Like, in the below example we are having two methods with same name "findMaxOf" but different signatures
    */
    public static int findMaxOf(int a, int b){
        return a>b ? a : b;
    }
    public static int findMaxOf(char a, char b){
        return a>b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(findMaxOf(5,30));
    }
}
