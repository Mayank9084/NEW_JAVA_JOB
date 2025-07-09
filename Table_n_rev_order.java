import java.util.Scanner;
public class Table_n_rev_order{
    public static  void main (String[] args) {
        System.out.print("which table you want to print in reverse order : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i=10;i>=0;i--){
            System.out.printf("\t%d X %d = %d\n",n,i,n*i);
        }
    }
}