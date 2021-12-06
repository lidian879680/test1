package com.ld.test.dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @className PreOrderTraversal_stack
 * @description 二叉树前序遍历，stack
 * @date 2021/7/26 17:14
 **/
public class PreOrderTraversal_stack {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        PreOrderTraversal_stack preOrderTraversal_stack = new PreOrderTraversal_stack();
        preOrderTraversal_stack.traveral(root);
        System.out.println("");
        preOrderTraversal_stack.traversal1(root);
    }

    private void traveral(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current;
        stack.addFirst(root);
        while (stack.size() > 0) {
            current = stack.pop();
            if (Objects.isNull(current)) {
                continue;
            }
            System.out.print(current.getVal());
            stack.addFirst(current.getRight());
            stack.addFirst(current.getLeft());
        }
    }

    /**
     * 2021-12-16复习
     * @param root
     */
    private void traversal1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            System.out.print(node.getVal());
            if (Objects.nonNull(node.getRight())) {
                stack.addFirst(node.getRight());
                node.setRight(null);
            }
            if (Objects.nonNull(node.getLeft())) {
                stack.addFirst(node.getLeft());
                node.setLeft(null);
            }
        }
    }
}
