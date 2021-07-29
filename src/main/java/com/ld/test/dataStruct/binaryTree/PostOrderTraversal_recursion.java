package com.ld.test.dataStruct.binaryTree;

import java.util.Objects;

/**
 * 二叉树后序遍历，递归
 */
public class PostOrderTraversal_recursion {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        PostOrderTraversal_recursion preOrderTraversal_recursion = new PostOrderTraversal_recursion();
        preOrderTraversal_recursion.traversal(root);

    }

    public void traversal(TreeNode root) {
        if (Objects.isNull(root)) {
            return;
        }
        traversal(root.getLeft());
        traversal(root.getRight());
        System.out.print(root.getVal());
    }

}
