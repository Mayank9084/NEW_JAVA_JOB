import java.util.Scanner;
public class Method_chapter {
    static int logic(int x, int y ){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    int logic1(int x1,int y1){
        int z1;
        z1 = x1*y1;
        return z1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of B : ");
        int b = sc.nextInt();
        int c = logic(a, b);
        System.out.println("Therefore C is : " + c);

        Method_chapter obj = new Method_chapter();
        int z = obj.logic1(a, b);
        System.out.println("Multiplication of A and B is : " + z);
    }
}
