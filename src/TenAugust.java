import java.util.HashMap;
import java.util.Map;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}


public class TenAugust {
    public static int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[] {0,0};

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int lookupnumber = target - nums[i];

            if(map.containsKey(lookupnumber)){
                return new int[] {i, map.get(lookupnumber)};
            }

            map.put(nums[i], i);
        }
        return null;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
    public static void main(String[] args) {

    }
}
