class Solution {
    // Optimized
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> iteratedNums = new HashSet<>();
        for (int num : nums) {
            if (iteratedNums.contains(num)) {
                return true;
            }
            iteratedNums.add(num);
        }
        return false;
    }
}