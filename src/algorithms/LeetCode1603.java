package src.algorithms;

public class LeetCode1603 {
    class ParkingSystem {
        int[] count = new int[3];
        public ParkingSystem(int big, int medium, int small) {
            count[0] = big;
            count[1] = medium;
            count[2] = small;
        }

        public boolean addCar(int carType) {
            if (count[carType-1] > 0) {
                count[carType-1]--;
                return true;
            } else {
                return false;
            }
        }
    }
}
