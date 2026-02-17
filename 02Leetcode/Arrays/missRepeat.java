public class missRepeat {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int[] freq = new int[(n * n) + 1];
        freq[0] = -1;
        for (int i = 0; i < grid.length; i++) {

            for (int j = 0; j < grid[0].length; j++) {
                freq[grid[i][j]]++;
            }
        }
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 2) {
                ans[j++] = i;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                ans[j++] = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        int[] ans = findMissingAndRepeatedValues(grid);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
