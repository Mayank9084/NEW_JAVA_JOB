class Phone{
    public void Time(){
        System.out.println("Subha hogyi babu");
    }
    public void call(){
        System.out.println("Call aari hai maalik");
    }
    static class Smart extends Phone{
        public void music(){
            System.out.println("Which song you want to play");
        }
        public void call(){
            System.out.println("Boss call receive krlo ");
        }
    }
}
public class Dynamic_method_Dispatch {
    public static void main(String[] args) {
        Phone Nokia = new Phone.Smart();
        Nokia.Time();
        Nokia.call();


    }
}
