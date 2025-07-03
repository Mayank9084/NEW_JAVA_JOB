import java.util.Scanner;
public class Enc_Dec_grade {
    public static void main(String[] args) {
        System.out.print("Enter your Grade which you want encrypt : ");
        Scanner sc = new Scanner(System.in);
        String grade = sc.nextLine();
        System.out.println("Actual Grade : " + grade);
        char c = grade.charAt(0);
        int x = 8;
        c = (char)(c + x);
        System.out.println("Therefore your ENCRYPTED grade : " + c);
    }
}
