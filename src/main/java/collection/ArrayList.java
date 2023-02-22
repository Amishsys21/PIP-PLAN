package main.java.collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> list =new java.util.ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        List<Integer> newList =new java.util.ArrayList<>();
        newList.add(40);
        newList.add(45);
        list.addAll(newList);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(45));
        System.out.println(list);
        list.set(1,1000);

        System.out.println(list);
        System.out.println( list.contains(1000));
        list.clear();
        System.out.println(list);

        System.out.println( list.contains(50));
        for (int i=0;i<list.size();i++)
        {
            System.out.println("list " + list.get(i));
        }
        Iterator<Integer> integerIterator=list.iterator();
        while (integerIterator.hasNext()){
            System.out.println("iterator"+integerIterator.next());
        }
    }
}
