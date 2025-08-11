package Abstract_Interfaces;
abstract class Phone{
    abstract void on();
}
class SmartPhone extends Phone {
    void on() {
        System.out.println("Turning on...");
    }
    public static class Ex_Abstract {
        public static void main(String[] args) {
            Phone obj = new SmartPhone();
            obj.on();
        }
    }
}
