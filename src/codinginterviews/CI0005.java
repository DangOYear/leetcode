package src.codinginterviews;


/**
 *面试题05. 替换空格
 *
 *请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 给定指定长度的数组
 * 遍历即可
 */
public class CI0005 {
    class Solution {
        public String replaceSpace(String s) {
            int blank = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == ' ') {
                    ++blank;
                }
            }
            char[] str = new char[2 * blank + s.length()];
            int pos = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) != ' ') {
                    str[pos++] = s.charAt(i);
                }else {
                    str[pos++] = '%';
                    str[pos++] = '2';
                    str[pos++] = '0';
                }
            }
            return new String(str, 0, pos);
        }
    }
}
