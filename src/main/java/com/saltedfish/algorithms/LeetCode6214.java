package com.saltedfish.algorithms;

public class LeetCode6214 {
    class Solution {

        class time {
            int minutes;

            time(String t) {
                String[] temp = t.split(":");
                minutes = Integer.parseInt(temp[1]) + Integer.parseInt(temp[0]) * 60;
            }

        }


        public boolean haveConflict(String[] event1, String[] event2) {
            time time11 = new time(event1[0]);
            time time12 = new time(event1[1]);
            time time21 = new time(event2[0]);
            time time22 = new time(event2[1]);

            if (time22.minutes < time11.minutes || time12.minutes < time21.minutes) {
                return false;
            }

            return true;
        }
    }

//    ["16:53","19:00"]
//            ["10:33","18:15"]
}
