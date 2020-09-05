package src.algorithms;

public class LeetCode0345 {
    class Solution {
        public String reverseVowels(String s) {
            int n = s.length();
            int left = 0;
            int right = s.length() - 1;
            char[] arr = s.toCharArray();
            while (left < right) {
                while (left < n && !isVowel(arr[left])) {
                    left++;
                }

                while (right >= 0 && !isVowel(arr[right])) {
                    right--;
                }

                if (left > right) {
                    break;
                }

                swap(arr, left, right);
                left++;
                right--;
            }
            return new String(arr);
        }

        public void swap(char[] arr, int left, int right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        public Boolean isVowel(char ch) {
            return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o')  || (ch == 'u')
                    || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U');
        }
    }
}
