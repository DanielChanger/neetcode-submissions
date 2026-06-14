// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        if (pairs.size() <= 1) {
            return pairs;
        }
        int middle = pairs.size() / 2;
        var left = mergeSort(List.copyOf(pairs.subList(0, middle)));
        var right = mergeSort(List.copyOf(pairs.subList(middle, pairs.size())));
        return merge(left, right);
    }

    private static List<Pair> merge(List<Pair> left, List<Pair> right) {
        var result = new ArrayList<Pair>();
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).key <= right.get(rightIndex).key) {
                result.add(left.get(leftIndex++));
            } else {
                result.add(right.get(rightIndex++));
            }        }
        while (leftIndex < left.size()) {
            result.add(left.get(leftIndex++));
        }
        while (rightIndex < right.size()) {
            result.add(right.get(rightIndex++));
        }
        result.forEach(System.out::println);
        return result;
    }
}
