import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(runningSum(arr)));

        System.out.println(Arrays.toString(shuffleArray(arr, 3)));

        System.out.println(kidsWithCandies(arr, 2));

        System.out.println(numIdenticalPairs(arr));

    }
}
