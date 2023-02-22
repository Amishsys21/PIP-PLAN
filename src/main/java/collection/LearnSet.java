package main.java.collection;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(32);
        set.add(42);
        set.add(352);
        set.add(3265);set.add(3562);set.add(3652);
        set.add(42);
        set.add(42);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);
        System.out.println(set);


            System.out.println(  set.remove(42));
              System.out.println(set.contains(42));
              System.out.println(set.isEmpty());





    }
}
