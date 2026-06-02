class Animal {
    public void hello() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.print("Generic Animal: ");
        myDog.hello();
        
        System.out.print("Dog: ");
        myDog.makeSound();
    }
}
