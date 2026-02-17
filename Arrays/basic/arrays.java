
public class arrays {

    // call by reference
    public static void printArray(boolean arr[]) { // printing an array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        // creation of array
        int arr[] = new int[100];
        int marks[] = { 1, 2, 3, 4 };
        System.out.println(marks[0]);

        // update
        marks[0] = 4;
        marks[0] = marks[0] + 10;
        System.out.println(marks[0]);

        // array as argument to function
        // printArray(marks);
        System.out.println();

        // int arr1[] = new int[20]; // initialized with all 0
        // char arr1[] = new char[20]; // initializes with spaces
        // byte arr1[] = new byte[20]; // initialzed with 0
        // float arr1[] = new float[20]; // initalized with 0.0
        // double arr1[] = new double[20]; // initalized with 0.0
        // String arr1[] = new String[20]; // initalized with null
        boolean arr1[] = new boolean[20]; // initalized with false
        // arr1[1] = ;
        // printArray(arr1);
        // System.out.println(arr1[23]); //out of bound

    }
}
