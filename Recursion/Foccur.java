public class Foccur {

    static int firstOccur(int arr[],int key,int i){
        if (i==arr.length || arr[i]==key) {
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        
        int[] arr = {5};
        int idx = firstOccur(arr, 4, 0);
        if (idx<arr.length) {
           System.out.println("key found at "+idx); 
        }
        else{

            System.out.println("key not found"); 
        }

    }
}
