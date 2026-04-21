interface Stack {
    int size = 5;
    void push(int element);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

    public void overflow() {
        System.out.println("Stack Overflow! Stack is full.");
    }

    public void underflow() {
        System.out.println("Stack Underflow! Stack is empty.");
    }

    public void push(int element) {
        if (top == size - 1) {
            overflow();
        } else {
            stack[++top] = element;
            System.out.println("Pushed: " + element);
        }
    }

    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackInterface {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70); // Overflow
        s.pop(); s.pop(); s.pop(); s.pop(); s.pop();
        s.pop();    // Underflow
    }
}
