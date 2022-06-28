/**
 * The premise if that isomorphic strings should tranform to same encoded string
 * as they should have 1:1 mapping of characters and same order of appearance of 
 * mapped characters
 */

class AlternateSolution {
    public boolean isIsomorphic(String s, String t) {
        return tranformString(s).equals(tranformString(t));
    }
    
    private String tranformString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) 
                map.put(c, i);
            
            builder.append(Integer.toString(map.get(c)));
            builder.append("-");
        }
        return builder.toString();
    }
}