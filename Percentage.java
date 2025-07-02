import java.util.Scanner;
public class Percentage {
    public static void main (String[] args){
        int sub1,sub2,sub3,sub4,sub5,marks;
        float total,prt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of subject one by one ");
        System.out.print("Enter subject 1st marks : ");
        sub1 = sc.nextInt();
        System.out.print("Enter subject 2nd marks : ");
        sub2 = sc.nextInt();
        System.out.print("Enter subject 3rd marks : ");
        sub3 = sc.nextInt();
        System.out.print("Enter subject 4th marks : ");
        sub4 = sc.nextInt();
        System.out.print("Enter subject 5th marks : ");
        sub5 = sc.nextInt();
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total Marks obtained = " + total);
        System.out.print("Marks out of : ");
        marks = sc.nextInt();
        prt = (total /(marks*5))*100;
        System.out.println("Your Percentage = " + prt);
    }
}