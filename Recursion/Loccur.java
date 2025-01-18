public class Loccur {
    static int lastOccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int ans = lastOccur(arr, key, i+1);
        if (ans == -1 && arr[i]==key) { // -1 is imp as it tells that i is last occurance idx
            
            return i;
        }
        return ans;
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3, 3, 4};
        int idx = lastOccur(arr, 3, 0);
        if (idx<arr.length) {
            System.out.println("key found at "+idx); 
        }
        else{

            System.out.println("key not found"); 
        }
    }
}
