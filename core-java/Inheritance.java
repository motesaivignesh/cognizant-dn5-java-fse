class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        System.out.print("Generic Animal: ");
        genericAnimal.makeSound();
        
        System.out.print("Dog: ");
        myDog.makeSound();
    }
}
