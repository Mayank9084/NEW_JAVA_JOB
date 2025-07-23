import java.util.Scanner;
class Reverse_Pattern{
    static void pattern(int n){
        for(int i=n; i>0 ;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pattern Length : ");
        int x = sc.nextInt();
        pattern(x);
    }
}