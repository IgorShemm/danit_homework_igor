package task_3;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        System.out.println("Adding elements to both ends of the deque...");
        deque.addFirst("Odesa");
        deque.addLast("Kyiv");
        deque.addFirst("Lviv");
        deque.addLast("Kharkiv");
        System.out.println("Deque after additions: " + deque);

        System.out.println("\nPeeking first and last elements...");
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        System.out.println("\nRemoving from both ends...");
        System.out.println("Removed first: " + deque.pollFirst());
        System.out.println("Removed last: " + deque.pollLast());
        System.out.println("Deque after removals: " + deque);

        System.out.println("\nChecking if deque contains 'Kyiv'...");
        System.out.println("Contains Kyiv? " + deque.contains("Kyiv"));

        System.out.println("\nGetting size of the deque...");
        System.out.println("Size: " + deque.size());

        System.out.println("\nClearing the deque...");
        deque.clear();
        System.out.println("Deque after clear: " + deque);
    }
}
