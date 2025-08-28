public class TwentyEightAugust {

    // Running Sum of 1D Array
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

    // Shuffle the Array
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }
        return ans;
    }

    public static void main(String[] args) {
        TwentyEightAugust obj = new TwentyEightAugust();

        // Test case 1: Running Sum
        int[] arr1 = {1, 2, 3, 4};
        int[] res1 = runningSum(arr1);
        System.out.print("Running Sum: ");
        for (int val : res1) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Test case 2: Shuffle
        int[] arr2 = {2, 5, 1, 3, 4, 7};
        int[] res2 = obj.shuffle(arr2, 3);
        System.out.print("Shuffled: ");
        for (int val : res2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
