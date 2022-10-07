object Solution {
    def maxArea(height: Array[Int]): Int = {
        var l = 0;
        var r = height.length-1;
        var ans = 0;
        
        while( l < r) {
            var temp = (r-l) * height(r).min(height(l));
            
            if ( temp > ans ) ans = temp;
            
            if (height(l) < height(r)) {
                l += 1;
            }
            else {
                r -= 1;
            }
        }
        return ans;
    }
}