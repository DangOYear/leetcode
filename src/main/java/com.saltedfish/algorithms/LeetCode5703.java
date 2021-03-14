package com.saltedfish.algorithms;

import java.util.PriorityQueue;

/**
 * @author SaltedFish
 * @date 2021/3/14
 */
public class LeetCode5703 {

    class ClassInfo {
        private int total;
        private int pass;
        private double avgGrades;
        private double weight;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPass() {
            return pass;
        }

        public void setPass(int pass) {
            this.pass = pass;
        }

        public void caculateAvgGrades() {
            this.avgGrades = (double) pass / total;
        }

        public void caculateWeight() {
            this.weight = ((double) (total - pass)) / (total * (total + 1));
        }

        public double getAvgGrades() {
            return avgGrades;
        }

        public double getWeight() {
            return weight;
        }
    }

    class Solution {
        public double maxAverageRatio(int[][] classes, int extraStudents) {

            int classAmount = classes.length;

            PriorityQueue<ClassInfo> pri = new PriorityQueue<>((o1, o2) -> {
                if (o1.getWeight() > o2.getWeight()) {
                    return -1;
                } else if (o1.getWeight() < o2.getWeight()) {
                    return 1;
                } else {
                    return 0;
                }
            });

            for (int i = 0; i < classAmount; i++) {
                ClassInfo classInfo = new ClassInfo();
                classInfo.setPass(classes[i][0]);
                classInfo.setTotal(classes[i][1]);
                classInfo.caculateAvgGrades();
                classInfo.caculateWeight();
                pri.add(classInfo);
            }

            for (int i = 0; i < extraStudents; i++) {
                ClassInfo classInfo = pri.poll();
                classInfo.setPass(classInfo.getPass() + 1);
                classInfo.setTotal(classInfo.getTotal() + 1);
                classInfo.caculateAvgGrades();
                classInfo.caculateWeight();
                pri.offer(classInfo);
            }

            double res = 0;
            for (int i = 0; i < classAmount; i++) {
                res += pri.poll().getAvgGrades();
            }
            return res / classAmount;
        }
    }

    public static void main(String[] args) {
        int[][] classes = new int[][]{{1,2},{3,5},{2,2}};
        int extraStudents = 2;
        LeetCode5703.Solution solution = new LeetCode5703().new Solution();
        System.out.println(solution.maxAverageRatio(classes, extraStudents));
    }
}
