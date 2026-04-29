class Solution {
    public int removeElement(int[] nums, int val) {
        int valCounter = 0;
        for (int i = 0, j = nums.length - 1; i <= j;) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    valCounter++;
                    j--;
                    continue;
                }
                nums[i] = nums[j];
                nums[j] = val;
                valCounter++;
                j--;
            }
            i++;
        }
        return nums.length - valCounter;
    }
}