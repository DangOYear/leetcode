package com.saltedfish.crackingthecodinginterview;

import com.saltedfish.baseclass.TreeNode;

/**
 * @author SaltedFish
 * @date 2021/6/4
 */
public class CTCI0412 {
    class Solution {

        private int dfs(TreeNode node, int sum) {
            if (node == null) {
                return 0;
            }

            int res = sum == node.val ? 1 : 0;
            sum -= node.val;
            return dfs(node.left, sum) + dfs(node.right, sum) + res;

        }

        public int pathSum(TreeNode root, int sum) {
            if (root == null) {
                return 0;
            }

            return pathSum(root.left, sum) + pathSum(root.right, sum) + dfs(root, sum);
        }
    }
}
