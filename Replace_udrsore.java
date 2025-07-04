import java.util.Scanner;
public class Replace_udrsore {
    public static void main(String[] args) {
        // Replace blank space with underscore @
        System.out.print("Write something : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your text before replace : " + str);
        str = str.replace(" ","@");
        System.out.println("Your text after replace : " + str);
    }
}
