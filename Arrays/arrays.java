

public class arrays {
    
    //call by reference 
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // System.out.println();
    }
    public static void main(String[] args) {
        //creation of array
        int arr[] = new int[100];
        int marks[] = {1,2,3,4};
        System.out.println(marks[0]);

        //update
        marks[0]=4;
        marks[0]=marks[0]+10;
        System.out.println(marks[0]);

        //array as argument to function
        printArray(marks);


    }
}
