package com.saltedfish.algorithms;


import java.util.Stack;

/**
 * 你现在是一场采用特殊赛制棒球比赛的记录员。这场比赛由若干回合组成，过去几回合的得分可能会影响以后几回合的得分。
 *
 * 比赛开始时，记录是空白的。你会得到一个记录操作的字符串列表 ops，其中 ops[i] 是你需要记录的第 i 项操作，ops 遵循下述规则：
 *
 * 整数 x - 表示本回合新获得分数 x
 * "+" - 表示本回合新获得的得分是前两次得分的总和。题目数据保证记录此操作时前面总是存在两个有效的分数。
 * "D" - 表示本回合新获得的得分是前一次得分的两倍。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * "C" - 表示前一次得分无效，将其从记录中移除。题目数据保证记录此操作时前面总是存在一个有效的分数。
 * 请你返回记录中所有得分的总和。
 *
 *
 * 示例 1：
 *
 * 输入：ops = ["5","2","C","D","+"]
 * 输出：30
 * 解释：
 * "5" - 记录加 5 ，记录现在是 [5]
 * "2" - 记录加 2 ，记录现在是 [5, 2]
 * "C" - 使前一次得分的记录无效并将其移除，记录现在是 [5].
 * "D" - 记录加 2 * 5 = 10 ，记录现在是 [5, 10].
 * "+" - 记录加 5 + 10 = 15 ，记录现在是 [5, 10, 15].
 * 所有得分的总和 5 + 10 + 15 = 30
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/baseball-game
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode0682 {
    class Solution {
        public int calPoints(String[] ops) {

            int res = 0;
            Stack<Integer> stack = new Stack<>();
            for (String op : ops) {
                if (op.charAt(0) == 'C') {
                    res -= stack.peek();
                    stack.pop();
                    continue;
                }
                if (op.charAt(0) == 'D') {
                    res += stack.peek() * 2;
                    stack.push(stack.peek() * 2);
                    continue;
                }

                if (op.charAt(0) == '+') {
                    int num1 = stack.peek();
                    stack.pop();
                    int num2 = stack.peek();
                    stack.push(num1);
                    stack.push(num1 + num2);
                    res += num1 + num2;
                    continue;
                }

                res += Integer.valueOf(op);
                stack.push(Integer.valueOf(op));

            }
            return res;
        }
    }

    public static void main(String[] args) {
        LeetCode0682.Solution solution = new LeetCode0682().new Solution();
        String[] ops = new String[]{"5","2","C","D","+"};
        System.out.println(solution.calPoints(ops));
    }
}
