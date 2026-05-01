class Solution {
    // Optimized
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character char1 = s.charAt(i);
            Character char2 = t.charAt(i);
            chars.computeIfPresent(char1, (k, v) -> v + 1);
            chars.putIfAbsent(char1, 1);
            chars.computeIfPresent(char2, (k, v) -> v - 1);
            chars.putIfAbsent(char2, -1);
        }
        return !chars.values().stream().anyMatch(i -> i != 0);
    }
}
