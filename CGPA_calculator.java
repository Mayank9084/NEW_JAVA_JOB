import java.util.Scanner;
public class CGPA_calculator {
    public static void main(String[] args) {
        System.out.print("Subject 1 : ");
        Scanner s = new Scanner(System.in);
        float sub1 = s.nextFloat();
        System.out.print("Subject 2 : ");
        float sub2 = s.nextFloat();
        System.out.print("Subject 3 : ");
        float sub3 = s.nextFloat();
        System.out.print("Subject 4 : ");
        float sub4 = s.nextFloat();
        System.out.print("Subject 5 : ");
        float sub5 = s.nextFloat();
        float cgpa = (sub1 + sub2 + sub3 + sub4 + sub5 )/5;
        System.out.println(cgpa);
    }
}
