import java.util.Scanner;
public class Methods_overloading {
    static void method1(){
        System.out.println("hey Bro was sup ");
    }
    static void method1(int a){
        System.out.println("You call Method1 Second Parameter " + a + " hey Bro was sup ");
    }
    static void method1(int a,int b){
        System.out.println("You call Method1 Third Parameter " + a + " hey Bro was sup " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of x : ");
        int x = sc.nextInt();
        System.out.print("enter the value of y : ");
        int y = sc.nextInt();
        method1();
        method1(x);
        method1(x,y);
    }
}
