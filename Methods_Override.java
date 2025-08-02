class A{
    public void meth1(){
        System.out.println("I am method 1 of Class A");
    }
    static class B extends A{
        @Override
        public void meth1() {
            //super.meth1();
            System.out.println("I am method 1 of Class B");
        }
    }
}
public class Methods_Override {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();
        A.B b = new A.B();
        b.meth1();
    }
}
