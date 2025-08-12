import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwelveAugust {

    // Node class for Linked List
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Method to remove N-th node from end of list
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int sz = 0;
        ListNode temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        if (head == null || n <= 0) {
            return head;
        }

        if (n == sz) { // Remove first node
            return head.next;
        }

        if (n > sz) { // If n is larger than list size
            return head;
        }

        int i = 0;
        int j = sz - n;
        ListNode prev = head;
        while (i < j - 1) {
            prev = prev.next;
            i++;
        }
        if (prev.next != null) {
            prev.next = prev.next.next;
        }
        return head;
    }

    // Method to find all triplets whose sum is zero
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // Step 1: sort the array

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println("Three Sum Result: " + threeSum(nums));


        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        TwelveAugust obj = new TwelveAugust();
        head = obj.removeNthFromEnd(head, 2); // 2nd node from end

        System.out.print("Linked List after removal: ");
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
