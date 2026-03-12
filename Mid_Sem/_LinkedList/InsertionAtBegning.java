package Mid_Sem._LinkedList;
import java.util.Scanner;

public class InsertionAtBegning {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Scanner sc = new Scanner(System.in); // Shared scanner

    public void creation() {
        int data, n;
        do {
            System.out.print("Enter data for initial list: ");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
            } else {
                // This is already inserting at the beginning
                new_node.next = head;
                head = new_node;
            }
            System.out.print("Do you want to add more? (Press 1 for yes): ");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void insertAndDisplay() {
        if (head == null) {
            System.out.println("LinkedList doesn't exist");
            return;
        }

        System.out.println("\n--- Insertion Options ---");
        System.out.print("1: At beginning, 2: At end, 3: At specific position: ");
        int m = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();
        Node new_node = new Node(val);

        switch (m) {
            case 1:
                new_node.next = head;
                head = new_node;
                break;

            case 2:
                Node temp = head;
                while (temp.next != null) { // Stop at the last node
                    temp = temp.next;
                }
                temp.next = new_node;
                break;

            case 3:
                System.out.print("Enter position (0-indexed): ");
                int p = sc.nextInt();
                if (p == 0) {
                    new_node.next = head;
                    head = new_node;
                } else {
                    Node temp1 = head;
                    for (int i = 0; i < p - 1 && temp1 != null; i++) {
                        temp1 = temp1.next;
                    }
                    if (temp1 != null) {
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                    }
                }
                break;
        }

        // Final Traversal to show results
        System.out.print("Final List: ");
        Node displayTemp = head;
        while (displayTemp != null) {
            System.out.print(displayTemp.data + " -> ");
            displayTemp = displayTemp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        InsertionAtBegning Iab = new InsertionAtBegning();
        Iab.creation();
        Iab.insertAndDisplay();
    }
}