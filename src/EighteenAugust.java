import java.util.HashMap;
import java.util.Map;

class ListNode1 {
    int val;
    ListNode next;

    ListNode1(int val) {
        this.val = val;
    }
}

public class EighteenAugust {

    // ---------- Two Sum ----------
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int lookupnumber = target - nums[i];
            if (map.containsKey(lookupnumber)) {
                return new int[]{map.get(lookupnumber), i}; // Correct order
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // ---------- Detect Cycle in Linked List ----------
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // ---------- Reverse Linked List ----------
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev; // new head
    }


    public static void main(String[] args) {
        TenAugust obj = new TenAugust();

        // --- Test Two Sum ---
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Two Sum: " + result[0] + " " + result[1]);

        // --- Test Reverse List ---
        ListNode1 head = new ListNode1(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        head = obj.reverseList(head);
        System.out.print("Reversed Linked List: ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();

        // --- Test Has Cycle ---
        ListNode cycleHead = new ListNode(1);
        cycleHead.next = new ListNode(2);
        cycleHead.next.next = new ListNode(3);
        cycleHead.next.next.next = cycleHead.next; // create cycle

        System.out.println("Has Cycle: " + obj.hasCycle(cycleHead));
    }
}

