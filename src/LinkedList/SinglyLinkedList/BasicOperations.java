package LinkedList.SinglyLinkedList;

public class BasicOperations {
    // Traversal of a linked list
    public static void traverse(Node head) {
        if (head == null) {
            System.out.println("The linked list is empty");
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print("->");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    // Iterative method
    public static int countNodesIter(Node head) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Recursive method
    public static int countNodesRec(Node head) {
        // Base case
        if (head == null) {
            return 0;
        }
        return 1 + countNodesRec(head.next);
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(1);
        traverse(head);
        int countNodes = countNodesRec(head);
        System.out.println("Length of linked list is: " + countNodes);
    }
}
