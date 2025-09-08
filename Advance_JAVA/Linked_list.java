package Advance_Java;
import java.lang.reflect.Array;
import java.util.*;

public class Linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set the size of Linked list : ");
        int a = sc.nextInt();
        System.out.println("Write values in Linked list ");
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(45);
        l2.add(49);
        l2.add(46);
        for(int i=0;i<a; i++){  // run loop 'a' times
            System.out.println("Value at index " + i + " is : ");
            int val = sc.nextInt();  // take input
            l1.add(val); // add to Linked List
        }
        System.out.println("Linked List elements are: ");
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        l1.addAll(l2);
        System.out.println("\nLiLinked List (l1 + l2 elements): ");
        for(int num : l1){
            System.out.print(num);
            System.out.print(" , ");
        }
        System.out.println(l1.contains(65));
        System.out.println(l2.contains(49));
        System.out.println(l1.indexOf(5));
    }
}
