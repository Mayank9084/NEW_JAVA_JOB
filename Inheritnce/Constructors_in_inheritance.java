package Inheritance;
class Parent{
    Parent(){
        System.out.println("I am a Parent class Constructor");
    }
    Parent(int x){
        System.out.println("I am Parent Class OVERLOADED Constructor with int x : " + x);
    }
    static class Child extends Parent{
        Child(){
            System.out.println("I am a Child class Constructor");
        }
        Child(int x, int y){
            super(x);
            System.out.println("I am Child Class OVERLOADED Constructor with int y: " + y);
        }
    }
    static class Grandchild extends Child{
        Grandchild(){
            System.out.println("I am a Grandchild class Constructor");
        }
        Grandchild(int x,int y,int z){
            super(x,y);
            System.out.println("I am Grandchild Class OVERLOADED Constructor with int z : " + z);
        }
    }
}
public class Constructors_in_inheritance {
    public static void main(String[] args) {
        Parent P = new Parent();
        Parent P1 = new Parent(2);
        System.out.println("\n");
        Parent.Child C = new Parent.Child();
        Parent.Child C1 = new Parent.Child(3,4);
        System.out.println("\n");
        Parent.Grandchild G = new Parent.Grandchild();
        Parent.Grandchild G1 = new Parent.Grandchild(5,6,7);
    }
}
