class DPSolution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        
        int[][] mem  = new int[s.length() + 1][t.length() + 1];
        for (int row = 1; row <= s.length(); row++) {
            for (int col = 1; col <= t.length(); col++) {
                if(s.charAt(row - 1) == t.charAt(col - 1)) 
                    mem[row][col] = mem[row-1][col-1] + 1;
                else 
                    mem[row][col] = Math.max(mem[row][col-1], mem[row-1][col]);
                
                if(mem[s.length()][col] == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}