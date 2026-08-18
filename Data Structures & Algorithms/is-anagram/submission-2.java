class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> freq = new HashMap<>();
        boolean result = true ;
        for (char letter : s.toCharArray()) {
            if (freq.containsKey(letter)){
                freq.put(letter,freq.get(letter)+1 );
            }
            else{
                freq.put(letter, 1);
            }
        }
        for (char c : t.toCharArray()){
            if (freq.containsKey(c)){
                freq.put(c,freq.get(c)-1 );
            }
            else{
                return false;
            }
        }
        for (int v : freq.values()){
            if ( v != 0){
                result = false;
                break ;
            }
        }
        return result ;
    }
}