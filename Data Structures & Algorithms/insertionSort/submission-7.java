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
        List<List<Pair>> sortStates = new ArrayList<>();
        for (int i = 0; i < pairs.size(); i++) {
            for (int j = i - 1; j >= 0 && pairs.get(j + 1).key < pairs.get(j).key; j--) {
                swap(pairs, j, j + 1);
            }
            sortStates.add(copyState(pairs));
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
            state.add(pair);
        }
        return state;
    }
}
