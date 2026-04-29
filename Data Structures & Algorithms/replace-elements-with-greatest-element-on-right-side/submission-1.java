class Solution {
    public int[] replaceElements(int[] arr) {
        int start = 0;
        int lastIndex = arr.length - 1;
        int end = lastIndex;        
        int currentMax = -1;
        int currentMaxIndex = 0;
        while (start < lastIndex) {
            if (start == end) {
                arr[start] = arr[currentMaxIndex];
                start++;
                currentMax = -1;
                end = lastIndex;
                continue;
            }
            if (currentMax < arr[end]) {
                currentMax = arr[end];
                currentMaxIndex = end;
            }
            end--;
        }
        arr[lastIndex] = -1;
        return arr;
    }
}