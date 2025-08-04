import java.util.*;

public class FourAugust {
    public static int[] runningSum(int[] nums) {
        int k = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[k] = sum;
            k++;
        }
        return nums;
    }

    public static int[] shuffleArray(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies > max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int numIdenticalPairsOptimal(int[] nums) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                cnt += map.get(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return cnt;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int small;
        for (int i = 0; i < nums.length; i++) {
            small = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    small++;
                }
            }
            ans[i] = small;
        }
        return ans;
    }

    public static int[] smallerNumbersThanCurrentOptimal(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = map.get(nums[i]);
        }
        return result;
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static int largestAltitude(int[] nums) {
        int cs = 0;
        int ms = 0;
        for (int num : nums) {
            cs += num;
            if (cs > ms) {
                ms = cs;
            }
        }
        return ms;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] arr1 = {0, 1, 2, 3, 4};

        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(runningSum(arr)));

        System.out.println(Arrays.toString(shuffleArray(arr, 3)));

        System.out.println(kidsWithCandies(arr, 2));

        System.out.println(numIdenticalPairs(arr));

        System.out.println(numIdenticalPairsOptimal(arr));

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

        System.out.println(Arrays.toString(smallerNumbersThanCurrentOptimal(arr)));

        System.out.println(Arrays.toString(createTargetArray(arr1, index)));

        System.out.println(largestAltitude(index));

    }
}
