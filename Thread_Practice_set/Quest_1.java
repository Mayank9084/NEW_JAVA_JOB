package Thread_Practice_set;
// Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads
class Thread1 extends Thread{
    public void run() {
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Thread2 extends Thread{
    public void run() {
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class Quest_1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
