public class prefixSum {

    //prefix sum array method finds the maximum or minimum of sum of subArray 

    // logic is to make an array named prefixSum which holds the sum of subArray upto self index 

    //for Eg: arr{1,2,3,4,5} the prefix array is prefixSum{1(1), 3(1+2), 6 (1+2+3), 10 (1+2+3+4), 15 (1+2+3+4+5)}=prefix(1,3,6,10,15)

    // solution is form by using (sum = prefix[end]-prefix[start-1])
    // {tc= O(n^2)}
    public static void main(String[] args) {
        int maxsum=Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int arr[]= {1,2,3,4,5};
        
        int n =arr.length;
        int prefix[] = new int[n];
        System.out.println(n);
        prefix[0] = arr[0];
            // System.out.println();
        for (int j = 1; j <= n-1; j++) {
            prefix[j]=prefix[j-1]+arr[j];
        }
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = i; j < n; j++) {
            sum=(i==0)? prefix[j]:prefix[j]-prefix[i-1];
            if (minsum>sum) {
                minsum=sum;
            } else if (maxsum<sum) {
                maxsum=sum;
            }
            }
            
        }
        System.out.println(minsum+" "+maxsum);
    }
    
}
