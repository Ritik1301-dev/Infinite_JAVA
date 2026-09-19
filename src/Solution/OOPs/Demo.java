package Solution.OOPs;
// static method never override bcz they belong to class not to object
// private methods cant be overriden
// final methods cannot be overriden
// fields and variable they can not be ploymorphic
public class Demo{
    public static void main(String[] args) {
      A f = new B();
      f.fun();

    }
}
class A {
      static void fun(){
        System.out.println("Hello");
    }
}
class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
}