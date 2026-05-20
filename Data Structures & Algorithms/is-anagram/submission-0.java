class Solution {
    public boolean isAnagram1(String s, String t) {
        if(s==null || t == null){
            return false; 
        }
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();
        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i); 
            if(smap.containsKey(c)){
                smap.put(c, smap.get(c)+1);
            } else {
                smap.put(c, 1);
            }
        }
        for(int i=0; i< t.length(); i++) {
            char c = t.charAt(i); 
            if(tmap.containsKey(c)){
                tmap.put(c, tmap.get(c)+1);
            } else {
                tmap.put(c, 1);
            }
        }
        return smap.equals(tmap);
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int i: count){
            if(i!=0)
                return false;
        }
        return true; 
    }
}
