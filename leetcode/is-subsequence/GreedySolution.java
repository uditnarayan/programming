/**
 * Space: O(target)
 * Time: O(target)
 */
class GreedySolution {

    private String source;
    private String target;

    public boolean isSubsequence(String s; String t) {
        this.source = s;
        this.target = t;
        return this.recIsSubsequence(0,0);
    }

    private boolean recIsSubsequence(int i, int j) {
        if (i == source.length()) return true;
        if (j == target.length()) return false;

        // If the character matches, look for next 
        // in rest of the target substring
        if (source.charAt(i) == target.charAt(j))
            return recIsSubsequence(i+1, j+1);
        
        // the char does not match, 
        // look for the same in rest of the target substring
        return recIsSubsequence(i, j+1);
    }
}