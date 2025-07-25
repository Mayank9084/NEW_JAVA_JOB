package Custom_class;
import java.util.Scanner;
class Square_Dime{
    int n;
    public void get_side(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your SQUARE side : ");
        n = sc.nextInt();
        System.out.print("Your side is : " + n);
    }
    public void area() {
        System.out.print("\nArea of SQUARE : " + n*n);
    }

    public void perimeter() {
        System.out.print("\nPerimeter of SQUARE is : " + 4*n);
    }
}
public class Square {
    public static void main(String[] args) {
        Square_Dime input = new Square_Dime();
        input.get_side();
        input.area();
        input.perimeter();
    }
}
