import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NineAugust {
    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
        // System.out.println(kelvin, fahranheit);
    }

    public static int[] twoSumOptimal(int[] nums, int target) {
        // int n = nums.length;
        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] + nums[j] == target){
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[] {0,0};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int lookupnumber = target - nums[i];

            if (map.containsKey(lookupnumber)) {
                return new int[]{i, map.get(lookupnumber)};
            }

            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }


    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            if(prices[i]-min > max){
                max = prices[i] - min;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        System.out.println(Arrays.toString(convertTemperature(24)));

        System.out.println(Arrays.toString(twoSum(nums, 5)));

        System.out.println(Arrays.toString(twoSumOptimal(nums, 18)));

        System.out.println(maxProfit(nums));
    }
}
