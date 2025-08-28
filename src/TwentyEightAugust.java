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
    public static void main(String[] args) {

    }
}
