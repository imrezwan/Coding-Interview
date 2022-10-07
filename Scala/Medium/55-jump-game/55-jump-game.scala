object Solution {
    def canJump(nums: Array[Int]): Boolean = {
        var goal = nums.length-1
        
        for ( i <- (nums.length-1) to 0 by -1) {
            if( i + nums(i) >= goal) {
                goal = i;
            }
        }
        return goal == 0;
    }
}