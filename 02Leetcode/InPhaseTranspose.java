
public class InPhaseTranspose {
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10,11,12},
                        {13,14,15,16},
                    };
    int row= 0;
    int col = 0;
    // transpose the nxn matrix
    while (row<matrix.length) {
        int i = row;
        for (int j = 0; j < col; j++) {
            int temp = matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i] = temp;   
        }
            
        row++;
        col++;

    }
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
    
}
