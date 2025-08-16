package Ch_11_Practise_set;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void smart(){
        System.out.println("This is smartTelephone");
    }
    @Override
    void ring() {
        System.out.println("Phone rings");
    }

    @Override
    void lift() {
        System.out.println("Phone Lift");
    }

    @Override
    void disconnect() {
        System.out.println("Phone Disconnects");
    }
}
public class Quest_4 {
    public static void main(String[] args) {
        Telephone obj = new SmartTelephone();
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
