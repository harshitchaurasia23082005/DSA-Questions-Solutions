import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLinkedList {

    // Function to merge two sorted lists
    public static Node mergeLists(Node l1, Node l2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (l1 != null && l2 != null) {

            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        if (l1 != null)
            current.next = l1;

        if (l2 != null)
            current.next = l2;

        return dummy.next;
    }

    // Function to print linked list
    public static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes in list1: ");
        int n1 = sc.nextInt();

        Node list1 = null, tail1 = null;

        System.out.println("Enter elements of list1:");
        for (int i = 0; i < n1; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (list1 == null) {
                list1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        System.out.print("Enter number of nodes in list2: ");
        int n2 = sc.nextInt();

        Node list2 = null, tail2 = null;

        System.out.println("Enter elements of list2:");
        for (int i = 0; i < n2; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);

            if (list2 == null) {
                list2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        Node merged = mergeLists(list1, list2);

        System.out.print("Merged List: ");
        printList(merged);

        sc.close();
    }
}