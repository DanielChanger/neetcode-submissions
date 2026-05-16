class Solution {
    public int[] twoSum(int[] nums, int target) {
        var seenNums = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (seenNums.containsKey(diff)) {
                return new int[] {seenNums.get(diff), i};
            } 
            seenNums.put(nums[i], i);
        }
        return new int[] {};
    }
}
