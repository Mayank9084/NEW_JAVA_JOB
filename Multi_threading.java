//This program demonstrates multithreading in Java by running two threads simultaneously:
//
//One prints messages about watching Netflix.
//
//The other prints messages about chatting.
//Both outputs mix together because the CPU switches between threads.
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<3000) {
            System.out.println("Watching NETFLIX");
            System.out.println("Awesome Feeling");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 3000) {
            System.out.println("Chatting with someone");
            System.out.println("Its Boring");
            i++;
        }
    }
}
public class Multi_threading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
