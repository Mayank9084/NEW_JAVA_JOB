package Inheritance;
class Animal{
    public void eating(){
        System.out.println("Its an ANIMAL class");
    }
    static class Dog extends Animal{
        public void barking(){
            System.out.println("Its Dog in ANIMAL class");
        }
    }
}
public class Quick_quiz1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eating();
        Animal.Dog m = new Animal.Dog();
        m.eating();
        m.barking();
    }
}
