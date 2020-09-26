package src.algorithms;

import src.algorithms.baseclass.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 501. 二叉搜索树中的众数
 *
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2].
 *
 * 提示：如果众数超过1个，不需考虑输出顺序
 *
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-mode-in-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LeetCode0501 {

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        List<Integer> ans = new ArrayList<Integer>();;
        int base, count, maxCount;


        public void dfs(TreeNode node) {
            if (node == null)
                return;
            dfs(node.left);
            update(node.val);
            dfs(node.right);
        }

        public void update(int val) {
            if (base == val) {
                ++count;
            } else {
                base = val;
                count = 1;
            }
            if (count == maxCount) {
                ans.add(val);
            }

            if (count > maxCount) {
                maxCount = count;
                ans.clear();
                ans.add(base);
            }
        }

        public int[] findMode(TreeNode root) {
            dfs(root);
            int[] mode = new int[ans.size()];
            for (int i = 0; i < mode.length; ++i) {
                mode[i] = ans.get(i);
            }
            return mode;
        }
    }
}
