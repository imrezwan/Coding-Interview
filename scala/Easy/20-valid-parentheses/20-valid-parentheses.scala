object Solution {
    def isValid(s: String): Boolean = {
        var st = new scala.collection.mutable.Stack[Char]();
        st.push(s(0));
        for ( i <- 1 to (s.length-1)) {
            val ch = s(i);
            
            if ( ch == '('
                || ch == '{'
                || ch == '[') {
                st.push(ch);
            }
            else if ( !st.isEmpty && 
                ( (ch == ')' && st.top == '(' )
                || (ch == '}' && st.top == '{' )
                || (ch == ']' && st.top == '[' ) )
            
            ) {
                st.pop();
            }
            else {
                return false;
            }
        }
    
        
        return st.isEmpty;
    }
}