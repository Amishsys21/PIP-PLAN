import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> aq=new ArrayDeque<>();
        aq.offer(10);
        aq.offer(15);
        aq.offer(17);
        aq.offer(20);
        aq.offerFirst(100);
        aq.offerLast(1000);
        System.out.println(aq);
        System.out.println(aq.peekFirst());
        System.out.println(aq.peekLast());
        System.out.println(aq.pollFirst());
    }
}
