/**
 * Space: O(1)
 * Time: O(target)
 */
class TwoPointerSolution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        
        int j = 0;
        for(int i = 0; i < t.length() && j < s.length(); i++) {
            if(t.charAt(i) == s.charAt(j)) 
                j++;
        }
        return j == s.length();
    }
}