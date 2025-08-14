import java.util.Arrays;

public class FourteenAugust {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // In case k > length
        revNum(nums, 0, nums.length - 1);
        revNum(nums, 0, k - 1);
        revNum(nums, k, nums.length - 1);
    }

    public static void revNum(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1); // Fill with 1 initially

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        // Test for rotate method
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println("Original array: " + Arrays.toString(nums1));
        rotate(nums1, k);
        System.out.println("Array after rotating by " + k + ": " + Arrays.toString(nums1));

        // Test for productExceptSelf method
        int[] nums2 = {1, 2, 3, 4};
        int[] product = productExceptSelf(nums2);
        System.out.println("Input array for productExceptSelf: " + Arrays.toString(nums2));
        System.out.println("Product except self: " + Arrays.toString(product));
    }
}
