import java.util.*;

public class FiveAugust {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k = k + num[i];
                i--;
            }
            list.addFirst(k % 10);
            k = k / 10;
        }
        return list;
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int lookUpNumber = target - nums[i];

            if (map.containsKey(lookUpNumber)) {
                return new int[]{i, map.get(lookUpNumber)};
            }

            map.put(nums[i], i);
        }
        return null;
    }

    public static int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);

            if (nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        if (ms == 0 && maxElement < 0) {
            return maxElement;
        }
        return ms;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};
        int k = 34;
        System.out.println(addToArrayForm(arr, k));

        System.out.println(Arrays.toString(twoSum(arr, 5)));

        System.out.println(Arrays.toString(twoSumOptimal(arr, 3)));


    }
}
