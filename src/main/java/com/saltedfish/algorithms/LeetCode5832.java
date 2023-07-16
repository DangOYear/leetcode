package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/8/1
 */
public class LeetCode5832 {
    class Solution {

        public int isEnough(long halfSideLength, long neededApples) {

            long numOfApples = 2 * halfSideLength * (halfSideLength + 1) * (halfSideLength * 2 + 1);

            if (numOfApples < neededApples) {
                return -1;
            } else {
                return 1;
            }
        }

        public long minimumPerimeter(long neededApples) {
            long left = 0;
            long right = 100000;
            while (left < right) {
                long mid = (left + right) / 2;
                int isEnouth = isEnough(mid, neededApples);
                if (isEnouth == -1) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return right * 8;
        }
    }

    public static void main(String[] args) {
        LeetCode5832.Solution solution = new LeetCode5832().new Solution();
        //System.out.println(solution.minimumPerimeter(1));
        System.out.println(solution.minimumPerimeter(13));
        //System.out.println(solution.minimumPerimeter(1000000000));
    }
}
