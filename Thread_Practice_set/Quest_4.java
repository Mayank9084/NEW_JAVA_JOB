package Thread_Practice_set;

class Thread7 extends Thread{
    public void run() {
        System.out.println("Good Morning");
    }
}
class Thread8 extends Thread{
    public void run() {
        System.out.println("Welcome");
    }
}
public class Quest_4 {
    public static void main(String[] args) {
        Thread7 t1 = new Thread7();
        Thread8 t2 = new Thread8();
        t1.start();
        t2.start();
        t1.setPriority(5);
        t2.setPriority(1);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }
}