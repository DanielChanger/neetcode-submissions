class Solution {
    public boolean isValid(String s) {
        var bracketsMapping = Map.of('(', ')', '{', '}', '[', ']');
        var openBrackets = new ArrayDeque<Character>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            System.out.println(bracket);
            if (bracketsMapping.containsKey(bracket)) {
                openBrackets.push(bracket);
            } else {
                if (openBrackets.isEmpty()) {
                    return false;
                }
                char leftBracket = openBrackets.pop();
                if (bracketsMapping.get(leftBracket) != bracket) {
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
