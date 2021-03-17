package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SaltedFish
 * @date 2021/3/17
 */
public class LeetCode0690 {

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    class Solution {

        private Map<Integer, Employee> employeeMap;

        private int calculateImportance(int id) {
            Employee employee = employeeMap.get(id);
            int res = employee.importance;
            for (Integer subId : employee.subordinates) {
                res += calculateImportance(subId);
            }
            return res;
        }



        public int getImportance(List<Employee> employees, int id) {
            employeeMap = new HashMap<>();
            for (Employee e : employees) {
                employeeMap.put(e.id, e);
            }
            return calculateImportance(id);
        }
    }
}
