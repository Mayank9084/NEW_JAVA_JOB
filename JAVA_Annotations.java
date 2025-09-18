@FunctionalInterface
interface myFunctionalInteface{
    void thisMethod();
//    void thisMethod2();
}

class NewPhone extends A{
   // @Override
    public void showTime(){
        System.out.println("Time is 8PM");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class JAVA_Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}
