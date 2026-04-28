class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSequence = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter++;
           } else {
                maxSequence = Math.max(counter, maxSequence);
                counter = 0;
            }
        }
        maxSequence = Math.max(counter, maxSequence);
        return maxSequence;
    }
}