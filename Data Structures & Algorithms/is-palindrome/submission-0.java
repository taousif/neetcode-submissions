class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9_-]", "");
        return str.equalsIgnoreCase(reverse(str));

    }

    static String reverse(String str) {
        int s=0, e=str.length()-1;
        char[] strArray = str.toCharArray();
        while(s<e) {
            char t= strArray[s];
            strArray[s] = strArray[e];
            strArray[e] = t; 
            s++;
            e--;
        }
        return new String(strArray);
    }
}
