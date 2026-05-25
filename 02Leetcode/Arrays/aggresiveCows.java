import java.util.Arrays;

public class aggresiveCows {

    public static boolean isValid(int[] stalls, int cows, int minValue){
        int cowsPlaced = 1;
        int lastCowPlaced = 0;
        int totalStalls = stalls.length;
        for(int currentCowIndex = 1;currentCowIndex < totalStalls && cowsPlaced < cows ; currentCowIndex++){
// if current cow and last placed cow distance is higher then give minDistValue(mid) is the min distance we want
            if (stalls[currentCowIndex] - stalls[lastCowPlaced] >= minValue) {
                cowsPlaced++;
                lastCowPlaced = currentCowIndex;
            }
            if (cowsPlaced == cows) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int stalls[] = {4, 2, 1, 10, 6}, k = 3;
        int totalStalls = stalls.length;
        Arrays.sort(stalls);
        
        int low = 1, high = stalls[totalStalls-1] - stalls[0];
        int maxMinDistance = 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if (isValid(stalls, k, mid)) {
                maxMinDistance = mid;
                low = mid +1;
            } else {
                high = mid -1;
            }
        }
        System.out.println(maxMinDistance);
    }

}

