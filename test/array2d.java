public class array2d {
    //creating 2d array
    //Eg:0
    // 0 _ _
    // 1 2 _
    // 2 3 4
    public static void main(String[] args) {
        int arr[][] = new int[3][];//created vertical array
        //stack    // //heap      //
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1]; // assigend horizontal array to vertical array of each index
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i+j;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
