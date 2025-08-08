import java.util.HashMap;

public class EightAugust {
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);
            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }
        return result.toString();
        // return address.replace(".","[.]");
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                i++;
            } else {
                if (command.charAt(i + 1) == ')') {
                    sb.append('o');
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4;
                }
            }
        }
        return sb.toString();
        // return command.replace("()", "o").replace("(al)", "al");
    }

    public static String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            res[indices[i]] = s.charAt(i);
        }
        String result = String.valueOf(res);
        return result;
    }

    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
        // return s.toLowerCase();
    }

    public static int singleNonDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1;
    }

    public static int singleNonDuplicateOptimal(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        } else if (nums[0] != nums[1]) {
            return nums[0];
        } else if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }
        int start = 1;
        int end = nums.length - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        String str = "1.1.1.1";

        String goal = "G()(al)";

        String str1 = "codeleet";

        int[] arr = {4, 5, 6, 7, 0, 2, 1, 3};

        int[] nums2 = {1, 1, 2, 3, 3, 4, 4, 8, 8};

        System.out.println(defangIPaddr(str));

        System.out.println(interpret(goal));

        restoreString(str1, arr);

        toLowerCase(str1);

        System.out.println(singleNonDuplicates(nums2));

        System.out.println(singleNonDuplicateOptimal(nums2));

    }
}
