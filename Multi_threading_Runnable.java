class MyRunnableThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<3000) {
            System.out.println("Watching NETFLIX");
            System.out.println("Awesome Feeling");
            i++;
        }
    }
}
class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 3000) {
            System.out.println("Chatting with someone");
            System.out.println("Its Boring");
            i++;
        }
    }
}
public class Multi_threading_Runnable {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
