package Ch_11_Practise_set;
class Monkey{
  void jump(){
      System.out.println("Jump");
  }
  void bite(){
      System.out.println("Bite");
  }
  interface BasicAnimals{
      void eat();
      void sleep();
  }
  static class Humans extends Monkey implements BasicAnimals{
      @Override
      public void eat() {
          System.out.println("eat");
      }

      @Override
      public void sleep() {
          System.out.println("Sleep");
      }
  }
}
public class Quest_3 {
    public static void main(String[] args) {
        Monkey.Humans obj = new Monkey.Humans();
        obj.jump();
        obj.bite();
        obj.eat();
        obj.sleep();
    }
}
