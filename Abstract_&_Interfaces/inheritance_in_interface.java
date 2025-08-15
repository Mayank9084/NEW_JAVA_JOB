package Abtract_Interfces;
interface parentInterface{
    void method1();
    void method2();
}
interface childInterface extends parentInterface{
    void method3();
    void method4();

}
class MySampleClass implements childInterface{
    @Override
    public void method1() {
        System.out.println("This is our METHOD 1");
    }
    public void method2() {
        System.out.println("This is our METHOD 2");
    }
    public void method3() {
        System.out.println("This is our METHOD 3");
    }
    public void method4() {
        System.out.println("This is our METHOD 4");
    }
}
public class inheritance_in_interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
