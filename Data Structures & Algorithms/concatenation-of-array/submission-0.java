class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length - 1; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        ans[nums.length - 1] = nums[nums.length - 1];
        ans[ans.length - 1] = nums[nums.length - 1];
        return ans;
    }
}