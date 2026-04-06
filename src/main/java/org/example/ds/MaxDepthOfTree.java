package org.example.ds;

public class MaxDepthOfTree {

    public static int getMaxDepthOfBinaryTree(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getMaxDepthOfBinaryTree(node.left);
        int rightDepth = getMaxDepthOfBinaryTree(node.right);
        return 1 + Math.max(leftDepth, rightDepth);
//Recursive DFS
    }

    static void main(String[] args) {

    }
}
