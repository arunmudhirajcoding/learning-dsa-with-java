
public class Searching {
    public static void main(String[] args) {
        int arr[][]={{1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}};
                    int key = 0;
        int n = arr.length,m = arr[0].length;

        //method-3 stearcase search tc = O(n+m) || O(n) ||O(m)
        //if matrix is sorted by row and column wise
        // logic: start from first row  and last row. 
        //if the element is small than key then the entir row is small as it sorted,so we reject row,
        //if the element is large that means it is that entire col is greater than the key as it sorted col wise so we reject col.

        //why we start from 0,m-1?
        //if we start from 0,0 right side are greater then element and down side means col wise are also greater so we can judge which side we should move is the element is not the key value
        int row=0,col=m-1;
        while (row<=n-1 && col>=0) {
            if (arr[row][col]==key) {
                System.out.println("element found at "+row+" "+col);
                return;
            } else if (arr[row][col]<key) {
                row++;
            }else{
                col--; 
            }
        }
        System.out.println("not found");










        //method-2
        // using binary search algo in row wise //tc = O(nlogn)
        // for (int r = 0; r < n; r++) {
        //     // start and end always 0, and m-1 as it is column array
        //     int start = 0,end = m-1;
        //     while (start<=end) {
        //         int mid = start+(end-start)/2;
        //         if (arr[r][mid]==key) {//comparing changes here as r increases
        //             System.out.println("element found at "+r+" "+mid);
        //             return;
        //         } else if (arr[r][mid]<key) {
        //             start=mid+1;
        //         }else{
        //             end=mid-1;
        //         }
        //     }
        // }


        //method-1
        // tc=O(n*m);
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (arr[i][j]==key) {
        //             System.out.println("found at "+i+" "+j);
        //             return;
        //         }
        //     }
        // }
    }
}
