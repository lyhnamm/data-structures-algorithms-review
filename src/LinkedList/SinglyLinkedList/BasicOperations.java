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

    // Insert a new node at first of a linked list
    public static Node insertAtFirst(Node head, int new_node) {
        Node newNode = new Node(new_node);
        newNode.next = head;
        return newNode;
    }

    // Insert a new node at last of a linked list
    public static Node insertAtLast(Node head, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    // Insert a new node after a given node
    public static void insertAfter(Node head, int key, int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == key) {
                Node newNode = new Node(data);
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }
            curr = curr.next;
        }
    }

    // Insert a new node before a given node
    public static Node insertBefore(Node head, int key, int data) {
        if (head == null) {
            return new Node(data);
        }
        if (head.data == key) {
            return insertAtFirst(head, data);
        }
        Node curr = head;
        Node prev = null;
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) {
            Node newNode = new Node(data);
            newNode.next = curr;
            prev.next = newNode;
        }
        return head;
    }

    // Insert a new node at a specific position
    public static Node insertAtSpecific(Node head, int pos, int data) {
        if (pos < 1) {
            return head;
        }
        if (pos == 1) {
            return insertAtFirst(head, data);
        }
        int count = 1;
        Node curr = head;
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }
        if (curr != null) {
            Node newNode = new Node(data);
            newNode.next = curr.next;
            curr.next = newNode;
        }
        return head;
    }

    // Delete at first in a linked list
    public static Node deleteAtFirst(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }

    // Delete at last in a linked list
    public static Node deleteAtLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // Delete at specific position in a linked list
    public static Node deleteAtSpecific(Node head, int pos) {
        Node curr = head, prev = null;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = curr.next;
            return head;
        }
        int i = 1;
        while (i < pos && curr != null) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (curr != null) {
            prev.next = curr.next;
        } else {
            System.out.println("Data is not presented");
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        traverse(head);
        head = insertBefore(head, 5, 4);
        traverse(head);

        int countNodes = countNodesRec(head);
        System.out.println("Length of linked list is: " + countNodes);
    }
}
