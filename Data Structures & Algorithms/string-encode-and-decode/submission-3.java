class Solution {
    String SEP = "<--->";
    String EMPTY = "<-EMPTY->";
    String SPACE = "<-SPACE->";
    String NULL = null;

    public String encode(List<String> strs) {
        if(strs.size() == 0) 
            return SEP;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.size(); i++) {
            String str = strs.get(i);
            if("".equals(str)) {
                sb.append(EMPTY);
            }
            if(" ".equals(str)){
                sb.append(SPACE);
            }
            else {
                sb.append(str);
            }
            if(i<strs.size()-1)
                sb.append(SEP);
        }

        // return String.join(SEP, strs.toArray(new String[0]));
        return sb.toString();
    }

    public List<String> decode(String str) {
        String[] strs = str.split(SEP);
        List<String> result = new ArrayList<>();
        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            if(s.equals(EMPTY)){
                result.add("");
            }
            else if(s.equals(SPACE)){
                result.add(" ");
            }
            else {
                result.add(s);
            }
        }
        return  result;
    }
}
