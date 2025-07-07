public class Loops_syntax {
    public static void main(String[] args) {
        // syntax of loops
        // While Loop
        int i = 1;
        while(i<=5){
            System.out.println("\t" + i);
            i++;
        }

        // Do-While Loop
        int a=1;
        do {
            System.out.println("value of a = " + a);
            a++;
        }
        while (a<5);

        // for loop
        for (int c = 0; c<=5; c++){
            System.out.println("value of c = " + c);
        }
    }
}
