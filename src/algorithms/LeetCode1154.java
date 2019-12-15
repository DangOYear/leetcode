package src.algorithms;

public class LeetCode1154 {
    class Solution {
        public int dayOfYear(String date) {
            int resDay = 0;
            String[] datetime = date.split("-");
            int year = Integer.valueOf(datetime[0]);
            int month = Integer.valueOf(datetime[1]);
            int day = Integer.valueOf(datetime[2]);
            boolean isLeapYear = (year % 100 == 0) && (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);

            int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            for (int i = 0; i < month-1; i++) {
                resDay += dayOfMonth[i];
            }
            if (isLeapYear && month > 2)
                resDay += 1;
            return resDay + day;
        }
    }

    public static void main(String[] args) {
        LeetCode1154.Solution solution = new LeetCode1154().new Solution();
        System.out.println(solution.dayOfYear("2019-01-09"));
    }
}
