package org.example.ds;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class EqualCheckTwoTrees {

    static boolean isSameTree(TreeNode firstT, TreeNode secondT) {
        //1. if both are null identical
        if (firstT == null && secondT == null)
            return true;
        //2. if any is not : Not identical
        if (firstT == null || secondT == null)
            return false;

        //3. if values are not equal: Not identical
        if (firstT.val != secondT.val)
            return false;

        //4. DFS search-- recursive
        return isSameTree(firstT.left, secondT.left) && isSameTree(firstT.right, secondT.right);
        //TC: O(n) SC: O(H)

    }

    static void main(String[] args) {
    /*
    To check if two binary trees are identical, we must verify three things at every node:
    1) The values of the current nodes are equal.
    2) The left subtrees are identical.
    3) The right subtrees are identical.
    The most effective way to solve this is using a Depth-First Search (DFS) approach via recursion.
     */
        //T1: same tree
        TreeNode p1 = new TreeNode(10);
        p1.left = new TreeNode(20);
        p1.right = new TreeNode(30);
        TreeNode q1 = new TreeNode(10);
        q1.left = new TreeNode(20);
        q1.right = new TreeNode(30);
        System.out.println("Test Case 1 (Identical): " + isSameTree(p1, q1));

        //T2: same tree
        TreeNode p2 = new TreeNode(10);
        p2.left = new TreeNode(20);
        p2.right = new TreeNode(30);
        TreeNode q2 = new TreeNode(10);
        q2.left = new TreeNode(20);
        q2.right = new TreeNode(31);
        System.out.println("Test Case 2 (Not Identical): " + isSameTree(p2, q2));


    }
}
