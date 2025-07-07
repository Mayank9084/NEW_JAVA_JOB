import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        System.out.print("Enter year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int check;
        check = year%100;
        if(check == 0) {
            System.out.println("\tThis Year is Century year  ");
            int check2 = year % 400;
            if (check2 == 0) {
                System.out.println("\tAnd Year is Leap year  ");
            } else {
                System.out.println("\tYear is not Leap year  ");
            }
        }
        else if (year%4 ==0){
                System.out.println("Year is leap year ");
            }
        else {
                System.out.println("year is not Leap year ");
            }
        }
    }

