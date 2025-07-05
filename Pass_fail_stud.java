import java.util.Scanner;
public class Pass_fail_stud {
    public static void main(String[] args) {
        System.out.println("Enter Subject Marks :- ");
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3, total;
        float per;
        System.out.print("Subject 1 marks : ");
        sub1 = sc.nextInt();
        System.out.print("Subject 2 marks : ");
        sub2 = sc.nextInt();
        System.out.print("Subject 3 marks : ");
        sub3 = sc.nextInt();
        if(sub1 <= 100 && sub2 <=100 && sub3 <= 100) {
            total = sub1 + sub2 + sub3;
            System.out.println("Total marks = " + total);
            per = ((float) total / 300) * 100;
            System.out.println("Total Percentage = " + per);
            if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33  ){
                    System.out.println("RESULT : PASS");
                }
                else {
                System.out.println("FAIL");
                    System.out.printf("You have less than 33 marks in one or more than one subject \nSubject 1 : %d \n subject 2 : %d \n Subject 3 : %d\n"
                            ,sub1,sub2,sub3);
                    System.out.println("Better luck next time");
                }
        }
        else{
            System.out.println("Marks should be less than 100");
        }
    }
}
