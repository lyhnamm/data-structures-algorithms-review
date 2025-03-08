package Stack.Implementation;

public class Stack {
    int top, cap;
    int[] a;

    public Stack(int cap) {
        this.cap = cap;
        top = -1;
        a = new int[cap];
    }

    public boolean push(int data) {
        if (top >= cap - 1) {
            System.out.println("Stack overflows");
            return false;
        }
        a[++top] = data;
        return true;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack underflows");
            return 0;
        }
        return a[top--];
    }

    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        }
        return a[top];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public boolean isFull() {
        return top >= cap - 1;
    }
}