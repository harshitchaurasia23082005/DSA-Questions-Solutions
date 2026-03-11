import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DetectLoopLinkedList {

    // Function to detect loop
    public static boolean hasCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // loop detected
            }
        }

        return false;                  // no loop
    }

    public static void main(String[] args) {

        Node head = new Node(3);
        Node second = new Node(2);
        Node third = new Node(0);
        Node fourth = new Node(-4);

        head.next = second;
        second.next = third;
        third.next = fourth;

        // Creating loop (tail connects to node with value 2)
        fourth.next = second;

        boolean result = hasCycle(head);

        System.out.println("Output: " + result);
    }
}