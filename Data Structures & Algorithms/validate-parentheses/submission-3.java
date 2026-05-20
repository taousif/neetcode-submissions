class Solution {
    public boolean isValid(String s) {
        if(s == null || s.equals("") || s.length() ==1) {
            return false;
        }
        Map<Character, Character> matches = new HashMap<>();
        matches.put('(', ')');
        matches.put('[', ']');
        matches.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            // System.out.println("Curr char : "+ c);
            if(matches.containsKey(c)){
                stack.push(c);
            } 
            else {
                if(stack.isEmpty())
                    return false;
                Character ch = stack.pop();
                if(matches.get(ch) != c) {
                    return false;
                }
            }
            // System.out.println(stack);
        }
        return stack.isEmpty();
    }
}
