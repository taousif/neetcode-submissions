class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> aMap = new HashMap<>();
        for(String str: strs) {
            aMap.computeIfAbsent(getFreqStr2(str), 
                        k -> new ArrayList<>()).add(str);
        }
        
        return new ArrayList(aMap.values());
    }

    String getFreqStr(String s) {
        char[] freqs = new char[26];
        for(char c: s.toCharArray()) {
            freqs[c-'a']++;
        }
        return Arrays.toString(freqs);
    }
    String getFreqStr2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }
}
