package Ch_11_Practise_set;
class Monkey1{
    void jump(){
        System.out.println("Jump");
    }
    void bite(){
        System.out.println("Bite");
    }
    interface BasicAnimals1{
        void eat();
        void sleep();
    }
    static class Humans1 extends Monkey1 implements BasicAnimals1{
        public void speak(){
            System.out.println("hello sir");
        }
        @Override
        public void eat() {
            System.out.println("eat");
        }

        @Override
        public void sleep() {
            System.out.println("Sleep");
        }
    }
}
public class Quest_5 {
    public static void main(String[] args) {
        Monkey1 m1 = new Monkey1.Humans1();
        m1.jump();
        m1.bite();
    }
}
