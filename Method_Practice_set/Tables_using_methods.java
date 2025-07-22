import java.util.Scanner;
public class Tables_using_methods {
    static void table(int n){
        for (int i=1 ; i<=10;i++){
            System.out.format(" %d * %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table you want to write : ");
        int x = sc.nextInt();
        table(x);
    }
}
