package Advance_Java;
import java.util.HashSet;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> myHastSet = new HashSet(6,0.5f);
        myHastSet.add(3);
        myHastSet.add(11);
        myHastSet.add(8);
        myHastSet.add(11);
        System.out.println(myHastSet);
        boolean contains = myHastSet.contains(11);
        System.out.println(contains);
    }
}
