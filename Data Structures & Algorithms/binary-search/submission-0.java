class Solution {
    public int search(int[] nums, int target) {
        int leftBoundary = 0;
        int rightBoundary = nums.length - 1;
        while (leftBoundary <= rightBoundary) {
            int middleIndex = (rightBoundary + leftBoundary) / 2; 
            int value = nums[middleIndex];
            if (value == target) {
                return middleIndex;
            }
            if (target < value) {
                rightBoundary = middleIndex - 1;
            } else {
                leftBoundary = middleIndex + 1;
            }
        }
        return -1;
    }
}
