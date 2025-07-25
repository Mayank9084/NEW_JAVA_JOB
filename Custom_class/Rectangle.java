package Custom_class;
import java.util.Scanner;
class Rect_Dime{
    int n;
    int n1;
    public void get_side(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rectangle Width : ");
        n = sc.nextInt();
        System.out.print("Enter your Rectangle Height : ");
        n1 = sc.nextInt();
        System.out.format("Your Rectangle width %d and height %d : ",n,n1);
    }
    public void area() {
        System.out.print("\nArea of Rectangle : " + n*n1);
    }

    public void perimeter() {
        int peri;
        int i = n + n1;
        peri = 2*i;
        System.out.print("\nPerimeter of Rectangle is : " + peri);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rect_Dime input = new Rect_Dime();
        input.get_side();
        input.area();
        input.perimeter();
    }
}
