import java.util.Scanner;
public class Table_n {
    public static void main(String[] args) {
        System.out.print("Enter number for Table : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<=10 ; i++){
            System.out.printf(" %d X %d = %d \n",n,i,n*i);
        }
    }
}
