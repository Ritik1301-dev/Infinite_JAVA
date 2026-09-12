package Solution.OOPs;

class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {

        Animal a= new Dog();
        a.sound();

       Animal b = new Cat();
        b.sound();
    }
}