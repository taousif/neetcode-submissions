class Solution {
    public boolean isPalindrome2(String s) {
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
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
