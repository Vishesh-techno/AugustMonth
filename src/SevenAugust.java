import java.util.Arrays;
import java.util.HashMap;

public class SevenAugust {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    public static int peakIndexMountainArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                ans = i;
            }
        }
        return ans;
    }

    public static int peakIndexMountainArrayOptimal(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = searchII(nums, target, true);
        int right = searchII(nums, target, false);
        result[0] = left;  // 3
        result[1] = right; // 4
        return result;
    }

    public static int searchII(int[] nums, int target, boolean isSearchLeft) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isSearchLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        if (end < 0) {
            return -1;
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int singleNonDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static int singleNonDuplicateOptimal(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 8, 9};

        int[] nums1 = {5, 7, 7, 8, 8, 8, 10};

        int[] nums2 = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(searchInsert(nums, 9));

        System.out.println(peakIndexMountainArray(nums));

        System.out.println(peakIndexMountainArrayOptimal(nums));

        System.out.println(search(nums, 5));

        System.out.println(Arrays.toString(searchRange(nums1, 8)));

        System.out.println(singleNonDuplicates(nums2));

        System.out.println(singleNonDuplicateOptimal(nums2));
    }
}
