class Solution {
    public int calPoints(String[] operations) {
        int top = -1;
        int[] stack = new int[operations.length];

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    stack[top + 1] = stack[top] + stack[top - 1];
                    top++;
                    break;
                case "D":
                    stack[top + 1] = stack[top] * 2;
                    top++;
                    break;
                case "C":
                    stack[top] = 0;
                    top--;
                    break;
                default:
                    int score = Integer.valueOf(operation);
                    stack[++top] = score;
            }
        }
        int sum = 0;
        while (top >= 0) {
            sum += stack[top--];
        }

        return sum;
    }
}