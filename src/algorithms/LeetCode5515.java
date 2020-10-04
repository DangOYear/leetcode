package src.algorithms;

public class LeetCode5515 {
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

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
}
