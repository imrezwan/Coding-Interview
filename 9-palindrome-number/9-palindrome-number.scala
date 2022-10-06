object Solution {
    def isPalindrome(x: Int): Boolean = {
        if ( x < 0 ) {
            return false;
        }

        var rev: Int = 0;
        var rem: Int = 0;
        var nx = x;
        while( nx > 0) {
            rem = nx%10;
            nx = nx / 10;
            rev = rev * 10 + rem;
        }
        return rev == x;
    }
}