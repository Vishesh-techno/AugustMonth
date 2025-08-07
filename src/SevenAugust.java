public class SevenAugust {
    public static int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        while(start < end){
            int mid = start +(end-start)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }

    public static int peakIndexMountainArray(int[] nums){
        int max = Integer.MIN_VALUE;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                ans = i;
            }
        }
        return ans;
    }

    public static int peakIndexMountainArrayOptimal(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start +(end-start)/2;

            if (nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8,9};

        System.out.println(searchInsert(nums, 9));

        System.out.println(peakIndexMountainArray(nums));

        System.out.println(peakIndexMountainArrayOptimal(nums));
    }
}
