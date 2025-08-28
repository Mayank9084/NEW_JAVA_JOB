package Thread_Practice_set;
//Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
class Thread3 extends Thread{
    public void run() {
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class Thread4 extends Thread{
    public void run() {
        try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        while(true){
            System.out.println("Welcome");
        }
    }
}

public class Quest_2 {
    public static void main(String[] args) {
        Thread3 t1 = new Thread3();
        Thread4 t2 = new Thread4();
        t1.start();
        t2.start();
    }
}