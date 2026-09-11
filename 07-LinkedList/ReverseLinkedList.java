import java.util.*;

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution.Node head = null;
        Solution.Node tail = null;

        for (int i = 0; i < n; i++) {
            Solution.Node node = new Solution.Node(sc.nextInt());

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        Solution obj = new Solution();
        head = obj.reverse(head);

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        sc.close();
    }
}
