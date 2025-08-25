package Threads_ch;
class MyThr extends Thread {
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am thread");
            i++;
        }
    }
}
public class Thread_const {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Mayank");
        MyThr t2 = new MyThr("Binod");
        t1.start();
        t2.start();
        System.out.println("MY thread 't1' ID is :" + t1.getId());
        System.out.println("MY thread 't1' ID is :" + t1.getName());
        System.out.println("MY thread 't2' ID is :" + t2.getId());
        System.out.println("MY thread 't2' ID is :" + t2.getName());
    }
}
