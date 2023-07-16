package com.saltedfish.baseclass;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

/**
 * @author SaltedFish
 * @date 2021/2/12
 */
public class InputUtils {
    public static int[] parseStringToNumsArray(String s) {
        List<Integer> nums = JSON.parseObject(s, List.class);
        int[] numsArray = new int[nums.size()];
        for (int i = 0; i < numsArray.length; ++i) {
            numsArray[i] = nums.get(i);
        }
        return numsArray;
    }
}
