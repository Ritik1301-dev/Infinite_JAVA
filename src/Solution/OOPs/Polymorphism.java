package Solution.OOPs;

public class Polymorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("miauu miauu");
        }
    }
    public static class Goat{
        void speak(){
            System.out.println("meeee meeee ");
        }
    } public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Goat g = new Goat();
        Human h = new Human();

        d.speak();
        c.speak();
        g.speak();
        h.speak();

    }
}
