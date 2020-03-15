package src.algorithms;

import java.util.*;




public class LeetCode0006 {
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        ArrayList<StringBuilder> rows = new ArrayList<>();
        
        
        for (int i = 0; i < Math.min(numRows, s.length()); ++i){
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean goingdown = false;
        
        for (char c:s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1)    goingdown = !goingdown;
            curRow += goingdown?1:-1;
        }
        
        StringBuilder res = new StringBuilder();
        
        for (StringBuilder row:rows) {
            res.append(row);
        }
        
        return res.toString();
        
        
    }
}
}
