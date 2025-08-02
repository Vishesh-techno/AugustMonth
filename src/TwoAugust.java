public class TwoAugust {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String w : word1) {
            sb1.append(w);
        }
        for (String w : word2) {
            sb2.append(w);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int j = 0;
            while (j < needle.length() && (i + j) < haystack.length()) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }

    public static int strStrOptimal(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String words : word) {
            sb.append(new StringBuilder(words).reverse().append(" "));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
