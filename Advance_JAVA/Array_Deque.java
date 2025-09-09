package Advance_Java;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        for (int i = 0; i < a; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            int value = sc.nextInt();   // take input
            ad1.add(value);             // add to ArrayDeque
        }
        System.out.println(ad1);
    }
}
