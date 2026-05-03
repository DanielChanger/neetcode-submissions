class Solution {
    public int calPoints(String[] operations) {
        int index = -1;
        int[] stack = new int[operations.length];

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    stack[index + 1] = stack[index] + stack[index - 1];
                    index++;
                    break;
                case "D":
                    stack[index + 1] = stack[index] * 2;
                    index++;
                    break;
                case "C":
                    stack[index] = 0;
                    index--;
                    break;
                default:
                    int score = Integer.valueOf(operation);
                    stack[++index] = score;
            }
        }
        int sum = 0;
        while (index >= 0) {
            sum += stack[index--];
        }

        return sum;
    }
}