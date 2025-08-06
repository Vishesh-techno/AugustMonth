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

    public static boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num/2;

        if(num < 2){
            return true;
        }
        while(start<=end){
            long mid = start + (end-start)/2;
            long sqrt = mid*mid;

            if(sqrt == num){
                return true;
            }else if(sqrt < num){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return false;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(letters[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return letters[start%letters.length];
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 2, 5, 6, 1, 8, 5};

        char[] ch = {'s', 'x', 'y'};
        int n = 100;
        System.out.println("Guessed number: " + guessNumber(n));

        System.out.println(Arrays.toString(twoSumII(nums, 15)));

        System.out.println(isPerfectSquare(45));

        System.out.println(nextGreatestLetter(ch, 'p'));

    }
}
