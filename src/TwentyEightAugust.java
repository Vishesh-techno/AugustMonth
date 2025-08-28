public class TwentyEightAugust {
    public static int[] runningSum(int[] nums) {
        int k = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            nums[k] = sum;
            k++;
        }
        return nums;
    }

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
