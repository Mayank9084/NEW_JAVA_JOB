package Thread_Practice_set;
//How do you get the reference to the current thread in Java?
class Thread9 extends Thread{
    public void run() {
        System.out.println("Good Morning");
    }
}
class Thread99 extends Thread{
    public void run() {
        System.out.println("Welcome");
    }
}
public class Quest_5 {
    public static void main(String[] args) {
        Thread9 t1 = new Thread9();
        Thread99 t2 = new Thread99();
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}