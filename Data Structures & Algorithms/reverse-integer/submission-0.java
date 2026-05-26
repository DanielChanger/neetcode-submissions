class Solution {
    public int reverse(int x) {
        var reversed = new StringBuilder(String.valueOf(x)).reverse().toString();
        if (x < 0) {
            reversed = "-" + reversed.replace("-", "");
        }
        try {
            return Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
