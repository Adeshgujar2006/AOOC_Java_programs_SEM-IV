import java.util.Scanner;

class Stack {
    private int[] arr = new int[5];
    private int top = -1;

    void push(int x) {
        if (top == 4) {
            System.out.println("Error: Stack Overflow! (Limit: 5)");
        } else {
            arr[++top] = x;
            System.out.println("Pushed " + x + " onto Stack.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Error: Stack Underflow! Nothing to pop.");
        } else {
            System.out.println("Popped " + arr[top--] + " from Stack.");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack Status: Empty");
        } else {
            System.out.print("Stack (Bottom to Top): ");
            for (int i = 0; i <= top; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

class Queue {
    private int[] arr = new int[5];
    private int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == 4) {
            System.out.println("Error: Queue Full! (Limit: 5)");
        } else {
            arr[++rear] = x;
            System.out.println("Enqueued " + x + " to Queue.");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Error: Queue Empty!");
        } else {
            System.out.println("Dequeued " + arr[front++] + " from Queue.");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue Status: Empty");
        } else {
            System.out.print("Queue (Front to Rear): ");
            for (int i = front; i <= rear; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

public class StackQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        Queue queue = new Queue();
        int choice;

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Push (Stack)");
            System.out.println("2. Pop (Stack)");
            System.out.println("3. Enqueue (Queue)");
            System.out.println("4. Dequeue (Queue)");
            System.out.println("5. Show All");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.print("Enter value to enqueue: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 4:
                    queue.dequeue();
                    break;
                case 5:
                    System.out.println("\n--- Current Data ---");
                    stack.display();
                    queue.display();
                    break;
                case 6:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input! Please try again.");
            }
        }
    }
}
