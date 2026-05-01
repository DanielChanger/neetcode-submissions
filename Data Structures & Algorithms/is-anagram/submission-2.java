class Solution {
    // Brute force
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Set<String> checkedChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            String character = s.substring(i, i + 1);
            if (checkedChars.contains(character)) {
                continue;
            }
            int charCount1 = 0;
            int charCount2 = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.substring(j, j + 1).equals(character)) {
                    charCount1++;
                }
                if (t.substring(j, j + 1).equals(character)) {
                    charCount2++;
                }
            }
            if (charCount1 != charCount2) {
                return false;
            }
            checkedChars.add(character);
        }
        return true;
    }
}
