package com.ld.test.dataStruct.binaryTree;

import java.util.Objects;

/**
 * 二叉树前序遍历，递归
 */
public class PreOrderTraversal_recursion {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        PreOrderTraversal_recursion preOrderTraversal_recursion = new PreOrderTraversal_recursion();
        preOrderTraversal_recursion.traversal(root);

    }

    public void traversal(TreeNode root) {
        if (Objects.isNull(root)) {
            return;
        }
        System.out.println(root.getVal());
        traversal(root.getLeft());
        traversal(root.getRight());
    }

    public static TreeNode initTreeNode() {
        TreeNode root1 = new TreeNode("a");
        TreeNode root2 = new TreeNode("b");
        TreeNode root3 = new TreeNode("c");
        TreeNode root4 = new TreeNode("d");
        TreeNode root5 = new TreeNode("e");
        TreeNode root6 = new TreeNode("f");
        TreeNode root7 = new TreeNode("g");
        TreeNode root8 = new TreeNode("h");
        TreeNode root9 = new TreeNode("i");
        TreeNode root10 = new TreeNode("j");
        root1.setLeft(root2);
        root1.setRight(root3);
        root2.setLeft(root4);
        root2.setRight(root5);
        root4.setRight(root8);
        root5.setLeft(root9);
        root5.setRight(root10);
        root3.setLeft(root6);
        root3.setRight(root7);
        return root1;
    }
}
