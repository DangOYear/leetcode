package com.saltedfish.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode0018 {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            int len = nums.length;
            if (nums == null || len < 4) {
                return res;
            }
            Arrays.sort(nums);
            for (int i = 0; i < len - 3; ++i) {
                if (i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                if (nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) {
                    break;
                }
                if (nums[i] + nums[len-1] + nums[len-2] + nums[len-3] < target) {
                    continue;
                }
                for (int j = i + 1; j < len - 2; ++j) {
                    if (j > i + 1 && nums[j] == nums[j-1]) {
                        continue;
                    }
                    if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) {
                        break;
                    }
                    if (nums[i] + nums[j] + nums[len-1] + nums[len-2] < target) {
                        continue;
                    }
                    int k = j + 1;
                    int l = len - 1;
                    while (k < l) {
                        int seqSum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (seqSum == target) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            while (k < l && nums[k] == nums[k+1]) {
                                ++k;
                            }
                            ++k;
                            while (k < l && nums[l] == nums[l-1]) {
                                --l;
                            }
                            --l;
                        } else {
                            if (seqSum < target) {
                                ++k;
                            } else {
                                --l;
                            }
                        }

                    }
                }
            }
            return res;
        }
    }
}
