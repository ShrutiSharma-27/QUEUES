import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(6);
        queue.add(5);
        queue.add(19);
        queue.add(1);

        System.out.println(queue.peek());
        System.out.println(queue.remove()); 
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());

        System.out.println(queue.contains(19)); //present : return true
        System.out.println(queue.contains(3)); //not present : return false
    }
}
