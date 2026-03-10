//Write a Java program to implement a stack and a queue.
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Stack_Queue_exp02 {
    public static void main(String[] args) {
        // Stack implementation
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Popped from stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue: " + queue);
        System.out.println("Removed from queue: " + queue.remove());
        System.out.println("Queue after removal: " + queue);
    }
}