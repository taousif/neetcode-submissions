class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> aMap = new HashMap<>();
        for(String str: strs) {
            // if(aMap.containsKey(getFreqStr(str))){
            //     aMap.get(getFreqStr(str)).add(str);
            // }
            // else {
            //     List<String> newList =new ArrayList<>(); 
            //     newList.add(str); 
            //     aMap.put(getFreqStr(str),  newList);
            // }
            aMap.computeIfAbsent(getFreqStr(str), k -> new ArrayList<>()).add(str);
        }
        for(String key: aMap.keySet()) {
            result.add(aMap.get(key));
        }
        return result;
    }

    String getFreqStr(String s) {
        char[] freqs = new char[26];
        for(char c: s.toCharArray()) {
            freqs[c-'a']++;
        }
        return new String(freqs);
    }
}
