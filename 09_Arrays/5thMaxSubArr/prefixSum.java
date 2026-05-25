public class prefixSum {

    //prefix sum array method finds the maximum or minimum of sum of subArray 

    // logic is to make an array named prefixSum which holds the sum of subArray upto self index 

    //for Eg: arr{1,2,3,4,5} the prefix array is prefixSum{1(1), 3(1+2), 6 (1+2+3), 10 (1+2+3+4), 15 (1+2+3+4+5)}=prefix(1,3,6,10,15)

    // solution is form by using (sum = prefix[end]-prefix[start-1]) every sum of subarray will get from this formula  start and end are the index of subarray  
    // {tc= O(n^2)} due to 2 loops
    public static void main(String[] args) {
        int maxsum=Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        int arr[]= {1,2,3,4,5};
        int n =arr.length;

        int prefix[] = new int[n];//prefix array
        System.out.println(n);

        prefix[0] = arr[0];

        for (int i = 1; i <= n-1; i++) {//making prefix array
            prefix[i]=prefix[i-1]+arr[i];
        }

        //start and end loop
        for (int start = 0; start < n; start++) {
            int sum =0;
            for (int end = start; end < n; end++) {

            // every sum of subarray will get from this formula  start and end are the index of subarray  
            sum=((start==0)? prefix[end]:prefix[end]-prefix[start-1]); // if index is 0 then the prefix is end index
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
