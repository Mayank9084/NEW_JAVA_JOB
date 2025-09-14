package Advance_java_practise_set;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest_1_Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of ARRAY : ");
        int a = sc.nextInt();
        sc.nextLine();

        ArrayList<String> ar = new ArrayList<>();

        for(int i = 1; i<=a ; i++){
            System.out.print("Enter Name of " + i + " student : ");
            String val = sc.nextLine();  // take input
            ar.add(val); // add to ArrayList
        }
        System.out.println("\nArrayList Students names are: ");
        for(String name : ar){
            System.out.println(name);
        }

    }
}
