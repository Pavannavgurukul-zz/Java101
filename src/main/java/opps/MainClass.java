package opps;

class Dog{
    String bread,color,name;
    
    public void bark(){
        System.out.println("My dog "+ name +" is barking");
    }
    public void description(){
        System.out.println("My dog "+ name +" has" +bread+ " bread and it's color is "+color);
    }
    
    
    }
public class MainClass {
    public static void main(String[] args) {
        Dog husky = new Dog();
        Dog poodle = new Dog();

        husky.name = "Moti";
        husky.bread = "Husky";
        husky.color = "While";

        poodle.name = "Motilaal";
        poodle.bread = "Poodle";
        poodle.


    }
    
}
