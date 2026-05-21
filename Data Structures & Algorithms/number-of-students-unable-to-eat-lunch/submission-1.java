class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sandwichTopIndex = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != -1 && students[i] == sandwiches[sandwichTopIndex]) {
                sandwichTopIndex++;
                students[i] = -1;
                i = -1;
            }
        }
        return sandwiches.length - sandwichTopIndex;
    }
}