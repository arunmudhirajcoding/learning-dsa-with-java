public class RotateTarget {
    public static int Search(int nums[], int target){
        int min = minSearch(nums);
        if (target>=nums[min]&&nums[min]>=nums.length-1) {
            return Search(nums, target, min, nums.length);
        } else {
            return Search(nums, target,0,min);
        }
    }
    
    public static int minSearch(int nums[]){
        int l = 0;
        int r = nums.length-1;
        while (l<r) {
            int mid = l+(r-l)/2;
            if (mid>0 && nums[mid-1]>nums[mid]) {
                return mid;
            } else if (nums[l]<=nums[mid]&&nums[mid]>nums[r]) {
                l = mid+1;
            } else{
                r = mid-1;
            }
        }
        return l;
    }
    public static int Search(int nums[],int n, int start,int end){
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (n==nums[mid]) {
                return mid;
            } else if (nums[mid]<n) {
                start = mid+1;
            }else {
                end = mid -1;
            }
            // System.out.println("hi");
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1 ,2};
        int in = Search(nums, 9);
        if (in ==-1) {
            System.out.println("Element not Found indexNotFound "+ in);
        } else {
            System.out.println("Element  Found at "+ in);
            
        }
    }
}