public class SixAugust {

    public static int pick = 42;

    public static int guess(int num) {
        if (num == pick) return 0;
        else if (num < pick) return 1;
        else return -1;
    }

    public static int guessNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (guess(mid) == 0) {
                return mid;
            } else if (guess(mid) == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int n = 100;
        System.out.println("Guessed number: " + guessNumber(n));

    }
}
