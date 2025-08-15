import java.util.HashSet;
import java.util.Set;

public class FifteenAugust {

    // Node class
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method 1: Using HashSet
    public boolean hasCycleUsingHashSet(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr)) {
                return true; // Cycle found
            }
            set.add(curr);
            curr = curr.next;
        }
        return false; // No cycle
    }

    // Method 2: Floyd's Cycle Detection Algorithm
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true; // Cycle found
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        FifteenAugust obj = new FifteenAugust();

        // Create nodes
        ListNode node1 = obj.new ListNode(1);
        ListNode node2 = obj.new ListNode(2);
        ListNode node3 = obj.new ListNode(3);
        ListNode node4 = obj.new ListNode(4);

        // Link nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // Creates a cycle (node4 points back to node2)

        // Test
        System.out.println("Cycle detected (HashSet)? " + obj.hasCycleUsingHashSet(node1));
        System.out.println("Cycle detected (Floyd's)? " + obj.hasCycle(node1));
    }
}
