class Solution {
    Map<Integer, Integer> resultCache = new HashMap<>();
    public int climbStairs(int n) { 
        if (resultCache.containsKey(n)) {
            return resultCache.get(n);
        }
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int result = climbStairs(n - 1) + climbStairs(n - 2);
        resultCache.put(n, result);
        return result;
    }
}
