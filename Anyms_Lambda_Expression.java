interface DemoAno1{
    void meth1();
}
interface DemoAno{
    void meth1();
    void meth2();
}
class AnonyDemo implements DemoAno{
    public void display(){
        System.out.println("Hello");
    }

    @Override
    public void meth1() {
        System.out.println("I am meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("I am meth 2");
    }
}
public class Anyms_Lambda_Expression {
    public static void main(String[] args) {
        AnonyDemo obj = new AnonyDemo();
        obj.meth1();

        DemoAno obj1 = new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth 1 of anonymous class");
            }

            @Override
            public void meth2() {
                System.out.println("I am meth 2 of anonymous class");
            }
        };
        obj1.meth1();

        // Lambda Expression
        DemoAno1 obj2 = ()->{
            System.out.println("I am method 1 of Lambda Expression");
        };
        obj2.meth1();
    }
}
