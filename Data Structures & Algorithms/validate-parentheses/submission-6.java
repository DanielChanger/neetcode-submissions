class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        var bracketsMapping = Map.of('(', ')', '{', '}', '[', ']');
        var openBrackets = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            System.out.println(bracket);
            if (bracketsMapping.containsKey(bracket)) {
                openBrackets.push(bracket);
                continue;
            } 
            if (openBrackets.isEmpty()) {
                return false;
            }
            while (!openBrackets.isEmpty()) {
                if (i == s.length()) {
                    return false;
                }
                bracket = s.charAt(i);
                char leftBracket = openBrackets.pop();
                if (bracketsMapping.get(leftBracket) != bracket) {
                    return false;
                }
                i++;
            }
            i--;
        }
        return openBrackets.isEmpty();
    }
}
