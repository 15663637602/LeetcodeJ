package medium.DailyTemperature739;

import java.util.Stack;

public class DailyTem {
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int[] res = new int[T.length];
        for (int i = 1; i < T.length; i++) {
            while (!stack.empty() && T[i] > T[stack.peek()]) {
                res[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;
    }
}
