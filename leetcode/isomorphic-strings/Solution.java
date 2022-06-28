class Solution {
    public boolean isIsomorphic(String s, String t) {

        // We need two dicts to ensure 1:1 mapping

        int[] mapStoT = new int[256];
        Arrays.fill(mapStoT, -1);
        
        int[] mapTtoS = new int[256];
        Arrays.fill(mapTtoS, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            // No mapping exists
            if(mapStoT[c1] == -1 && mapTtoS[c2] == -1) {
                mapStoT[c1] = c2;
                mapTtoS[c2] = c1;
            }
            
            // Either map does not exists or mapping exits and does not match
            else if (!(mapStoT[c1] == c2 && mapTtoS[c2] == c1)) {
                return false;
            }
        }
        return true;
    }
}