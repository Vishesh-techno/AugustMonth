public class ElevenAugust {
    public static int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[start] > nums[mid] && nums[mid] < nums[end]) {
                return nums[mid];
            }
        }
        return nums[start];
    }

    public static int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
            if(nums[i] > maxElement){
                maxElement = nums[i];
            }
        }
        if(ms == 0 && maxElement < 0){
            return maxElement;
        }
        return ms;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
        System.out.println(maxSubArray(nums));
    }
}
