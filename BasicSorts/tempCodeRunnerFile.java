
    public static void main(String[] args) {
        int nums[] = {1, 4, 1, 3, 2, 4, 3, 7};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int FArr[] = new int[largest+1];//including 0 
        for (int i = 0; i < FArr.length; i++) {
            FArr[nums[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < FArr.length; i++) {
            while (FArr[i] > 0) {
                nums[j] = i;
                j++;
                FArr[i]--;
            }
        }

    }
}