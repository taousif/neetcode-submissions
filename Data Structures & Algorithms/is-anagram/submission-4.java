class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false; 
        char[] sChars = new char[26];
        char[] tChars =  new char[26];
        for(char c: s.toCharArray()) {
            sChars[c-'a']++ ;
        }
        for(char c: t.toCharArray()) {
            tChars[c-'a']++ ;
        }
        return new String(sChars).equals(new String(tChars));
    }
}
