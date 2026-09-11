import java.util.*;

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public int findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

public class FindMiddle {
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
        System.out.println(obj.findMiddle(head));

        sc.close();
    }
}
