package src.crackingthecodinginterview;

public class CTCI1601 {
    class Solution {
        public int[] swapNumbers(int[] numbers) {
            numbers[0] = numbers[1] - numbers[0];
            numbers[1] = numbers[1] - numbers[0];
            numbers[0] = numbers[0] + numbers[1];
            return numbers;
        }
    }
}
