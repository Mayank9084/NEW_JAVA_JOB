import java.util.Scanner;
class Fibonnaci_series{
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        else {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        System.out.print("How many numbers of Fibonacci series you want : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=0 ; i<num ; i++){
            System.out.print(fibo(i) + " ");
        }
    }
}