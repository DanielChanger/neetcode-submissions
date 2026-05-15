class Solution {
    // Streams
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        var chars1 = getCharacterFrequencies(s);
        var chars2 = getCharacterFrequencies(t);
        return chars1.keySet()
                     .stream()
                     .allMatch(i -> chars2.containsKey(i) && Objects.equals(chars1.get(i), chars2.get(i)));
    }

    private static Map<Integer, Long> getCharacterFrequencies(String word) {
        return word.chars()
                   .boxed()
                   .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }
}
