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


    public static void main(String[] args) {
        String str = "anagram";
        String str1 = "nagaram";
        System.out.println(isAnagram(str, str1));
    }
}
