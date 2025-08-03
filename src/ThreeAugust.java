public class ThreeAugust {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        revNum(nums, 0, nums.length - 1);
        revNum(nums, 0, k - 1);
        revNum(nums, k, nums.length - 1);
    }

    public void revNum(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {

    }
}
