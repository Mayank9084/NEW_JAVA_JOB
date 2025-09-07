package Advance_Java;
import java.lang.reflect.Array;
import java.util.*;

public class Array_LIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set the size of ARRAY : ");
        int a = sc.nextInt();
        System.out.println("Write values in Array ");
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(45);
        l2.add(49);
        l2.add(46);
        for(int i=0;i<a; i++){  // run loop 'a' times
            System.out.println("Value at index " + i + " is : ");
            int val = sc.nextInt();  // take input
            l1.add(val); // add to ArrayList
        }
        System.out.println("\nArrayList elements are: ");
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        l1.addAll(l2);
        System.out.println("\nFinal ArrayList (l1 + l2 elements): ");
        for(int num : l1){
            System.out.print(num);
            System.out.print(" , ");
        }
        System.out.println(l1.contains(65));
        System.out.println(l2.contains(49));
        System.out.println(l1.indexOf(5));
    }
}
