class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();

        for(int i=0, j=chars.length-1; i<j; i++, j--) {
           while(i<j && !Character.isLetterOrDigit(chars[i])) {
                i++; 
                continue;
           } 
           while(i<j && !Character.isLetterOrDigit(chars[j])) {
                j--;
                continue;
           }
            if(i<j && chars[i] != chars[j]) {
                return false;
            }

        }
        return true; 
    }
}
