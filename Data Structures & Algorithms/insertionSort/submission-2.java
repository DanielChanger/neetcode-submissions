// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        if (pairs.isEmpty()) {
            return List.of();
        }
        List<List<Pair>> sortStates = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            sortStates.add(copyState(pairs));
            for (int j = i + 1; j > 0 && j < pairs.size() && pairs.get(j).key < pairs.get(j - 1).key; j--) {
                swap(pairs, j - 1, j);
            }
        }
        return sortStates;
    }

    private static void swap(List<Pair> pairs, int i, int j) {
        var temp = pairs.get(i);
        pairs.set(i, pairs.get(j));
        pairs.set(j, temp);
    }

    private List<Pair> copyState(List<Pair> pairs) {
        List<Pair> state = new ArrayList<>();
        for (var pair : pairs) {
            state.add(new Pair(pair.key, pair.value));
        }
        return state;
    }
}
