class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> st = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        
        while(right<s.length()){
            if(st.add(s.charAt(right))){
                right++;
                max = Math.max(max, right-left);
            }
            else{
                st.remove(s.charAt(left++));
            }
        }
        return max;
    }
}