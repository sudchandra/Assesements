import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueProcess {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(4);
        System.out.println("elements after adding to queue is"+queue);

        // Removing an element with duplicate
        int q1 = 0;
        for (Integer element : queue) {
            q1 = 0;
            for (Integer item : queue) {
                if (element.equals(item)) {
                    q1++;
                }
            }
            if (q1 > 1) {
                queue.remove(element);
                break;
            }
        }

        // Printing all elements in the queue
        System.out.println("Elements in the queue: " + queue);

        // Printing and removing a queue element
        System.out.println("Removed element: " + queue.poll());
        System.out.println("Elements in the queue: " + queue);

    }
}
