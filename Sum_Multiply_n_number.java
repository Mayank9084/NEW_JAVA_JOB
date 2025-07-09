import java.util.Scanner;
public class Sum_Multiply_n_number{
    public static  void main (String[] args) {
        System.out.print("Write number which you want to add their multiplication : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,sum=0;
        for (i=1;i<=10;i++){
            sum = sum + (n*i);
        }
        System.out.println("SUM : " + sum);
    }
}