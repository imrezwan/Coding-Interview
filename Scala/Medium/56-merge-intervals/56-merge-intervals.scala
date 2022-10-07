object Solution {
    def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
        var sortedAr = intervals.sortWith( (a, b) => a(0) < b(0));
        var outputs: List[Array[Int]] = List[Array[Int]]();
        outputs = outputs :+ sortedAr(0);
        
        for(i <- 1 to (intervals.length-1)) {
            var lastEnd = outputs.last;
            if ( sortedAr(i)(0) <= lastEnd(1) ) {
                outputs.last(1) = lastEnd(1).max(sortedAr(i)(1));
            }
            else {
                outputs = outputs :+ sortedAr(i);
            }
        }

        return outputs.toArray;
    }
}