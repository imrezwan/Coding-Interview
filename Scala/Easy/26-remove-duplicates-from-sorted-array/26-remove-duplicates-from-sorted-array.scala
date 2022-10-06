object Solution {
    def removeDuplicates(nums: Array[Int]): Int = {
        var cur = 1;
        for ( i <- 1 to (nums.length-1)) {
            if (nums(i) != nums(i-1)) {
                nums(cur) = nums(i);
                cur += 1;
            }
        }
        
        return cur
    }
}