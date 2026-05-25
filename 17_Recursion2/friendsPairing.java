public class friendsPairing {
//     Friends Pairing Problem
// Given n friends, each one can remain single or can be paired up with some other
// friend. Each friend can be paired only once. Find out the total number of ways in
// which friends can remain single or can be paired up.

//if 1 mem = ways 1 ie single
// if 2 mem = 2 singles or 1 pair
// if 3 mem = 1 single 2 pairs * 3, or 3 singles 
static int friendsPair(int n){
    // base
    if (n==1 || n == 2) {
        return n;
    }
    return friendsPair(n-1) * (n-1)*friendsPair(n-2);
}
    public static void main(String[] args) {
        int n = 3;
        System.out.println(friendsPair(n));
    }
}
