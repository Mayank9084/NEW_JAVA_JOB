package Thread_Practice_set;
//Demonstrate gerPriority() and setPriority() methods in Java threads
class Thread5 extends Thread{
    public void run() {
            System.out.println("Good Morning");
        }
}
class Thread6 extends Thread{
    public void run() {
            System.out.println("Welcome");
    }
}
public class Quest_3 {
    public static void main(String[] args) {
        Thread5 t1 = new Thread5();
        Thread6 t2 = new Thread6();
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
