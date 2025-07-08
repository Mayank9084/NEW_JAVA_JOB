import java.util.Scanner;
public class Break_continue_syntax {
    public static void main(String[] args) {
        // -----> Continue and break Statement using FOR Loop <--------
        System.out.println("\n\t-----> Continue and break Statement in FOR Loop <--------");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Write n : " + n);
        for(int i=0 ; i<=n ; i++){
            if(i==4){
                System.out.println("yha skip hua");
                continue;
            }
            if(i==7){
                System.out.println("yha break hua");
                break;
            }
            System.out.println("\t\n" + i);
        }


        //Continue and break Statement using While Loop
        System.out.println("\n\t-----> Continue and break Statement in While Loop <--------");
        int a = 1;
        while(a<=5){
            if(a==2){
                System.out.println("yha skip hua");
                a++; //yha increment isliye hua hai vrna loop 2 pe chla he rhega
                continue;
            }
            if(a==4){
                System.out.println("Yha k baad over");
                break;
            }
            System.out.println("\t" + a);
            a++;
        }

        // -----> Continue and break Statement using DO-WHILE Loop <--------
        System.out.println("\n\t-----> Continue and break Statement in DO-While Loop <--------");
        int x = 0;
        do {
            if(x==2){
                System.out.println("yha skip hua");
                x++;
                continue;
            }
            if(x==4){
                System.out.println("Yha k baad over");
                break;
            }
            System.out.println(x);
            x++;
        }while (x<=8);
    }
}
