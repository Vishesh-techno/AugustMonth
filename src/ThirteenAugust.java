import java.util.Stack;

public class ThirteenAugust {
    public static boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }

    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false; // powers of 3 are positive
        while (n % 3 == 0) {
            n /= 3; // keep dividing by 3
        }
        return n == 1; // if it's a power of 3, it should end up at 1
    }


    public static void main(String[] args) {
        String str = "anagram";
        String str1 = "nagaram";
        System.out.println(isAnagram(str, str1));

        String str2 = "([)]";
        System.out.println(isValid(str2));

        System.out.println(xorOperation(5, 0));

        System.out.println(isPowerOfThree(45));
    }
}
