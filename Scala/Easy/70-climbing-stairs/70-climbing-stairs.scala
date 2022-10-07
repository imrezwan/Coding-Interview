object Solution {
    var dp = new Array[Int](100);
    def climbStairs(n: Int): Int = {
        if( n == 1) return 1;
        else if (n == 2) return 2;
        if(dp(n) != 0) return dp(n);
        dp(n) = climbStairs(n-1) + climbStairs(n-2);
        return dp(n);
    }
}