import java.util.Arrays;

public class SixAugust {

    public static int pick = 42;

    public static int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return 1;
        else return -1;
    }

    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static int[] twoSumII(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int total = num[start] + num[end];

            if (total == target) {
                return new int[]{start + 1, end + 1};
            } else if (total > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 5, 6, 1, 8, 5};
        int n = 100;
        System.out.println("Guessed number: " + guessNumber(n));

        System.out.println(Arrays.toString(twoSumII(nums, 15)));


    }
}
