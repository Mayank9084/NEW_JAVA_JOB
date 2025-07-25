package Custom_class;
class cell_phone{
    public void ringing(){
        System.out.println("Ringing");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
}
public class Phone {
    public static void main(String[] args) {
        cell_phone oppo_R8 = new cell_phone();
        oppo_R8.ringing();
        oppo_R8.vibrating();
    }
}
