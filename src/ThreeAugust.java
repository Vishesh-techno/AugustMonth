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

    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int x = 0;
        int y = 0;
        int dx = 1;
        int dy = 0;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < rows * cols; i++) {
            res.add(matrix[y][x]);
            matrix[y][x] = -101; // the range of numbers in matrix is from -100 to 100

            if (!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows) || matrix[y+dy][x+dx] == -101) {
                int temp = dx;
                dx = -dy;
                dy = temp;
            }

            x += dx;
            y += dy;
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
