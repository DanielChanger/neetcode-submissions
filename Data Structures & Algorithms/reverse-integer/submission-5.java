class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int prev = 0;
        int xMod = Math.abs(x);
        while (xMod >= 1) {
            prev = reverse;
            int digit = xMod % 10;
            xMod -= digit;
            xMod /= 10;
            reverse *= 10;
            reverse += digit;
            if ((reverse - digit) / 10 != prev) {
                return 0;
            }
           
        }
        return x > 0 ? reverse : -reverse;
    }
}
