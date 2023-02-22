import java.util.Comparator;
import java.util.Queue;

public class LearnPriorityQueue {


    public static void main(String[] args) {
        Queue<Integer> queue=new java.util.PriorityQueue<>(Comparator.reverseOrder());
        queue.add(5);queue.add(2);queue.add(3);queue.add(4);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.peek();
        System.out.println(queue);
    }
}
