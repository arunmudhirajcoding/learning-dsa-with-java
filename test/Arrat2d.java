
public class Arrat2d {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 10, 11, 12, 13 }, { 14, 15, 16, 17 } };
        int row = matrix.length, col = matrix[0].length;
        int key = 3;

        // consider the 2d array is 1d array apply binary on both row and col at a time
        

        // binary search on column
        for (int i = 0; i < row; i++) {
            // row is const then apply binary search on col
            int start = 0, end = matrix[i].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (key == matrix[i][mid]) {
                    System.err.print("found ele " + i + " " + mid);
                    return;
                } else if (matrix[i][mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("not found");

        // linear search
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // if (matrix[i][j]==key) {
        // System.out.println("found at"+i+" "+j);
        // return;
        // }
        // }
        // }
    }
}
