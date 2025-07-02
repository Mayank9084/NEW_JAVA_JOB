import java.util.Scanner;
public class Good_day_greet {
    public static void main(String[] args) {
        System.out.print("What is your name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + ", have a good day ");
    }
}
