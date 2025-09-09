package task_3;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Adding elements to queue...");
        queue.add("Odesa");
        queue.add("Kyiv");
        queue.add("Lviv");
        queue.add("Kharkiv");
        queue.add("Dnipro");
        System.out.println("Queue after additions: " + queue);

        System.out.println("\nPeeking the head of the queue...");
        System.out.println("Head element: " + queue.peek());

        System.out.println("\nPolling (removing) the head element...");
        System.out.println("Polled: " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        System.out.println("\nChecking if queue contains 'Kyiv'...");
        System.out.println("Contains Kyiv? " + queue.contains("Kyiv"));

        System.out.println("\nGetting size of the queue...");
        System.out.println("Size: " + queue.size());

        System.out.println("\nChecking if queue is empty...");
        System.out.println("Is empty? " + queue.isEmpty());

        System.out.println("\nClearing the queue...");
        queue.clear();
        System.out.println("Queue after clear: " + queue);
    }
}
