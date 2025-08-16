package Ch_11_Practise_set;
abstract class Pen{
   abstract void write();
   abstract void refill();
}
class FountainPen extends Pen{
    @Override
    void write() {
        System.out.println("Pen is writing");
    }

    @Override
    void refill() {
        System.out.println("Pen refill is Empty");
    }
    void changeNib(){
        System.out.println("Change Nib");
    }

}
public class Quest_1 {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.write();
        obj.refill();
        obj.changeNib();
    }
}
