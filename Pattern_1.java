import java.util.Scanner;
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("You Select = " + n);
        int i,j;
        for (i=n;i>0;i--){
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
