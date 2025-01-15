
public class spiralMatrix {
    public static void main(String[] args) {
        int martrix[][] = {{1, 2, 3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                        {13,14,15,16},
                        {18,19,20,21},
                        {22,23,24,25}};

                        int sr=0,er=martrix.length-1;
            int sc=0,ec=martrix[0].length-1;

            while(sr<=er && sc<=ec){
            //top
            for (int i = sc; i <=ec; i++) {
            System.out.print(martrix[sr][i]+" ");
            }
            sr++;

            //right
            for (int i = sr; i <=er; i++) {
            System.out.print(martrix[i][ec]+" ");
            }
            ec--;
            //bottom
            for (int i = ec; i >=sc; i--) {
                if (sr==er) {
                    break;
                }
            System.out.print(martrix[er][i]+" ");
            }
            er--;
            //right
            for (int i = er; i >=sr; i--) {
                if (sc==ec) {
                    break;
                }
            System.out.print(martrix[i][sc]+" ");
            }
            sc++;
            } 
    }
    
}

