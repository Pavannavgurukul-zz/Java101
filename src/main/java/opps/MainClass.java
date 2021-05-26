package opps;

class Dog{
    /*
    Class is basically just a blue print of any realtime object.
     Here we are having a class named Dog, it doesn't consume any space into the heap memory only it's objects will consume.
     Dog has some properties like bread, color, and name these calls the states of any class
     Dog class having some functionality like bark and description these are the behaviours
    */
    String bread,color,name;
    
    public void bark(){
        System.out.println("My dog "+ name +" is barking.");
    }
    public void description(){
        System.out.println("My dog "+ name +" has " +color+ " color and it's bread is "+bread+".");
    }
    
    
    }
public class MainClass {
    public static void main(String[] args) {
        Dog husky = new Dog();
        Dog poodle = new Dog();

        husky.name = "Moti";
        husky.bread = "Husky";
        husky.color = "while";

        poodle.name = "Motilaal";
        poodle.bread = "Poodle";
        poodle.color = "black";

        husky.bark();
        husky.description();

        poodle.bark();
        poodle.description();


    }
    
}
