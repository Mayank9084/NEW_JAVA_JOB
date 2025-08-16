package Ch_11_Practise_set;
interface TVremote{
   void volumeUp();
   void channel();
}
interface SmartTvRemote extends TVremote{
    void gemini();
    void search();
}
class SmartTv implements SmartTvRemote{
    @Override
    public void gemini() {
        System.out.println("You can ask using GEMINI");
    }

    @Override
    public void search() {
        System.out.println("You can search using SCANNER");
    }

    @Override
    public void volumeUp() {
        System.out.println("you can VOLUME UP");
    }

    @Override
    public void channel() {
        System.out.println("You can change CHANNEL");
    }
}
public class Quest_6 {
    public static void main(String[] args) {
        SmartTv obj = new SmartTv();
        obj.gemini();
        obj.search();
        obj.volumeUp();
        obj.channel();
    }
}
