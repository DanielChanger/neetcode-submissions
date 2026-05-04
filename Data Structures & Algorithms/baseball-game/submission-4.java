class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();        
        for (String operation : operations) {
            switch (operation) {
                case "+":
                    int top = stack.pop();
                    int prev = stack.peek();
                    stack.push(top);
                    stack.push(top + prev);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.valueOf(operation));
            }
        }
        // keeping it old school
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}