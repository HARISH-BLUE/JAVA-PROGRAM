class Animal {
    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("scoobby barks: Woof!");
    }
}

public class override {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        
        animal.speak();
        dog.speak();
    }
}
