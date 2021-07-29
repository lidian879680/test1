package com.ld.test.dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @className PreOrderTraversal_stack
 * @description 二叉树中序遍历，stack
 * @date 2021/7/26 17:14
 **/
public class InOrderTraversal_stack {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        InOrderTraversal_stack preOrderTraversal_stack = new InOrderTraversal_stack();
        preOrderTraversal_stack.traveral1(root);
    }

    private void traveral(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        while (Objects.nonNull(currentNode) || stack.size() > 0) {
            if (Objects.nonNull(currentNode)) {
                stack.addFirst(currentNode);
                currentNode = currentNode.getLeft();
            }else {
                currentNode = stack.pop();
                System.out.print(currentNode.getVal());
                currentNode = currentNode.getRight();
            }
        }
    }

    /**
     * 另一种更直观的方法
     * @param root
     */
    private void traveral1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        while (stack.size() > 0) {
            TreeNode treeNode = stack.pop();
            TreeNode leftNode = treeNode.getLeft();
            TreeNode rightNode = treeNode.getRight();
            if (Objects.nonNull(rightNode)) {
                stack.addFirst(rightNode);
                treeNode.setRight(null);
            }

            if (Objects.nonNull(leftNode)) {
                //左边有值
                stack.addFirst(treeNode);
                stack.addFirst(leftNode);
                treeNode.setLeft(null);
            } else {
                System.out.print(treeNode.getVal());
            }
        }
    }
}
