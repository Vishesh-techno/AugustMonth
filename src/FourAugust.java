import java.util.Arrays;

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

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(runningSum(arr)));

        System.out.println(Arrays.toString(shuffleArray(arr, 3)));

    }
}
