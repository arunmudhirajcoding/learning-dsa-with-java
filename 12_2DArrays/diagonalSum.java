public class diagonalSum {
    public static void main(String[] args) {
        // 2 cases 
        //case-1 n=odd
        // //eg:1 2 3
        //      3 4 5
        //      6 7 8
        // sum of diagonal = 1+4+8+3+4+6=but 4 is calucated twice which is index 2,2 means leave i=j=n-1 element

        //case -2 n=even
        // //eg:1  2  3  4 
        //      5  6  7  8
        //      9  10 11 12
        //      13 14 15 16
        // sum of diagonal = 1+6+11+16+4+7+10+13; no overlap

        int matrix[][]={{1, 2, 3},
                        {3, 4, 5},
                        {6, 7, 8}};
        // int matrix[][]={{1, 2, 3,12},
        //                 {3, 4, 5,13},
        //                 {6, 7, 8,14},
        //                 {9, 10, 11,15}};
        int sum=0;
        //method-2 tc=O(n)
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];
            if (i!=matrix.length-1-i) {
                
                sum+=matrix[i][matrix.length-1-i];//i+j=n-1 then j=n-1-i;
            }
        }



        // method -1 all cases cover but tc = O(n^2)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if ((i==j)||((i+j)==matrix.length-1)) {
                    
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        System.out.println(sum);
    }
}
