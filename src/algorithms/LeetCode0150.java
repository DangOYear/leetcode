package src.algorithms;


import java.util.Stack;

public class LeetCode0150 {
    public class Solution {
        public int evalRPN(String[] tokens) {

            Stack<Integer> stack = new Stack<>();
            int num1 = 0;
            int num2 = 0;
            for (String str:tokens) {
                switch(str){
                    case "+":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1+num2);
                        break;

                    case "-":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1-num2);
                        break;

                    case "*":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1*num2);
                        break;


                    case "/":
                        num2 = stack.pop();
                        num1 = stack.pop();
                        stack.push(num1/num2);
                        break;
                    default:
                        stack.push(Integer.valueOf(str));
                }

            }
            return stack.peek();
        }
    }
}
