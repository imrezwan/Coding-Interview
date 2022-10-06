object Solution {
    def runningSum(nums: Array[Int]): Array[Int] = {
        for ( i <- 1 to (nums.length-1) ){
            nums(i) = nums(i-1) + nums(i)
        }
        return nums;
    }
}