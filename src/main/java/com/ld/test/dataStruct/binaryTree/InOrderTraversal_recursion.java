package com.ld.test.dataStruct.binaryTree;

import java.util.Objects;

/**
 * 二叉树中序遍历，递归
 */
public class InOrderTraversal_recursion {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        InOrderTraversal_recursion preOrderTraversal_recursion = new InOrderTraversal_recursion();
        preOrderTraversal_recursion.traversal(root);

    }

    public void traversal(TreeNode root) {
        if (Objects.isNull(root)) {
            return;
        }
        traversal(root.getLeft());
        System.out.print(root.getVal());
        traversal(root.getRight());
    }

}
