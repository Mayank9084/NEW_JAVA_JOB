package Abtract_Interfces;
interface Camera{
    void takePic();
    void shootVdo();
    private void snippet(){
        System.out.println("Taking Snippet....");
    }
    default void shoot4Kvdo(){
        snippet();
        System.out.println("Shooting 4K video...");
    }
}

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling..." + phoneNumber);
    }
}
class MySmartPhone extends CellPhone implements Camera, MyWifi{
    @Override
    public void takePic() {
        System.out.println("Taking pic...");
    }

    @Override
    public void shootVdo() {
        System.out.println("Capturing Video...");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting Lists of Networks");
        String[] networkList = {"Mayank","Iphone","OPPO"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting..." + network);
    }
}

public class Interfacs_Defat_method_ex {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.shoot4Kvdo();
        ms.takePic();
        ms.shootVdo();
        ms.callNumber(908498478);
        ms.connectToNetwork(" WIFI Home");
        String[] ar = ms.getNetwork();
        for (String items:ar)
        {
            System.out.println(items);
        }
    }
}
