package main.java.stream;

import java.util.*;
import java.util.stream.Collectors;

public class example1 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        long count = numList.stream().count();
        System.out.println("totalElement "+ count);
        long evenNumber=numList.stream().filter(a->a%2==0).count();
        System.out.println("evenNumber "+ evenNumber);
        long oddNumber=numList.stream().filter(a->a%2!=0).count();
        System.out.println("oddNumber "+ oddNumber);
        List<Integer> emptyList=new ArrayList<>();
        long emptyLists=emptyList.stream().count();
        System.out.println("emptyLists "+ emptyLists);
        long emptyStringList=strList.stream().filter(a->a.isEmpty()).count();
        System.out.println("emptyStringList "+ emptyStringList);
        List<String>  abcList=strList.stream().filter(a->a.contentEquals("abc")).collect(Collectors.toList());
        System.out.println(abcList);
        List<String>  abList=strList.stream().filter(a->a.length()>3).collect(Collectors.toList());
        System.out.println(abList);
        String G71=G7.stream().map(a->a.toUpperCase()).collect(Collectors.joining(""));
        System.out.println(" G71"+ G71);
        IntSummaryStatistics de21=primes.stream().mapToInt((x)->x).summaryStatistics();
        int seb=primes.stream().mapToInt((x)->x).sum();
        System.out.println(de21);
       OptionalDouble seb1=primes.stream().mapToInt((x)->x).average();
        OptionalInt seb2=primes.stream().mapToInt((x)->x).min();
        OptionalInt seb3=primes.stream().mapToInt((x)->x).max();
        System.out.println("sum :-"+seb);
        System.out.println("average :-"+seb1);
        System.out.println("minimum:-"+seb2);
        System.out.println("maximum:-"+seb3);



    }
}
