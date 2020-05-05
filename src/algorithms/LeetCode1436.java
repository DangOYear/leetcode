package src.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode1436 {

    class Solution {
        public String destCity(List<List<String>> paths) {
            String res = null;
            Set<String> fromCity = new HashSet<>();
            Set<String> toCity = new HashSet<>();
            for (List<String> pair : paths) {
                fromCity.add(pair.get(0));
                toCity.add(pair.get(1));
            }
            for (String city : toCity) {
                if (!fromCity.contains(city)) {
                    res = city;
                }
            }
            return res;
        }
    }

}
