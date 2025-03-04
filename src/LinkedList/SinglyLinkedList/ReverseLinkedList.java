package LinkedList.SinglyLinkedList;

import java.util.Stack;

public class ReverseLinkedList {
    // Use Iterative
    public static Node reverseLinkedList(Node head) {
        Node curr = head;
        Node prev = null, next = null;

        while (curr != null) {
            // store next node
            next = curr.next;

            // reverse curr's node next pointer
            curr.next = prev;

            // move pointer
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Use Stack
    public static Node reverse2(Node head) {
        Node curr = head;
        Stack<Node> stack = new Stack<>();

        // Traverse linked list and push every node to stack
        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        // Reverse a linked list;
        if (!stack.empty()) {
            // new head pointer of a linked list
            head = stack.pop();
            curr = head;
            while (!stack.empty()) {
                curr.next = stack.pop();
                curr = curr.next;
            }
            curr.next = null;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head = BasicOperations.insertAtLast(head, 2);
        head = BasicOperations.insertAtLast(head, 3);
        head = BasicOperations.insertAtLast(head, 4);
        head = BasicOperations.insertAtLast(head, 5);
        // traverse
        BasicOperations.traverse(head);
        head = reverse2(head);
        BasicOperations.traverse(head);
    }
}
