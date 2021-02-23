package medium.ReversePolish150;

import java.util.Stack;

public class EvalReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (isOp(str)) {
                int ret = doOp(stack.pop(), stack.pop(), str);
                stack.push(ret);
            } else {
                stack.push(Integer.valueOf(str));
            }
        }
        return stack.pop();
    }

    private int doOp(Integer pop1, Integer pop, String str) {
        switch (str) {
            case "+":
                return pop + pop1;
            case "-":
                return pop - pop1;
            case "*":
                return pop * pop1;
            case "/":
                return pop / pop1;
        }
        return 0;
    }

    private boolean isOp(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
