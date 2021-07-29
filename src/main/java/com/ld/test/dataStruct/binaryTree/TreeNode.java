package com.ld.test.dataStruct.binaryTree;

/**
 * @className TreeNode
 * @description 二叉树结构
 * @date 2021/7/26 16:56
 **/
public class TreeNode {
    private String val;
    private TreeNode right;
    private TreeNode left;

    public TreeNode(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }
}
