package com.ld.test.dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @className PreOrderTraversal_stack
 * @description 二叉树后续遍历，stack
 * @date 2021/7/26 17:14
 **/
public class PostOrderTraversal_stack {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        PostOrderTraversal_stack preOrderTraversal_stack = new PostOrderTraversal_stack();
        preOrderTraversal_stack.traveral(root);
        System.out.println("");
        TreeNode root1 = PreOrderTraversal_recursion.initTreeNode();
        preOrderTraversal_stack.traversal1(root1);
    }

    /**
     * 更直观的方法
     * @param root
     */
    private void traveral(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode currentNode = root;
        stack.addFirst(currentNode);
        while (stack.size() > 0) {
            TreeNode treeNode = stack.pop();
            TreeNode leftNode = treeNode.getLeft();
            TreeNode rightNode = treeNode.getRight();
            if (Objects.isNull(leftNode) && Objects.isNull(rightNode)) {
                System.out.print(treeNode.getVal());
                continue;
            }
            //有子节点，压回去
            stack.addFirst(treeNode);
            if (Objects.nonNull(rightNode)) {
                stack.addFirst(rightNode);
                treeNode.setRight(null);
            }
            if (Objects.nonNull(leftNode)) {
                stack.addFirst(leftNode);
                treeNode.setLeft(null);
            }

        }
    }

    /**
     * 2021-12-06 练习
     * @param root
     */
    private void traversal1(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        while (stack.size() > 0) {
            TreeNode node = stack.pop();
            TreeNode left = node.getLeft();
            TreeNode right = node.getRight();
            if (Objects.isNull(left) && Objects.isNull(right)) {
                System.out.print(node.getVal());
                continue;
            }
            node.setLeft(null);
            node.setRight(null);
            stack.addFirst(node);
            if (Objects.nonNull(right)) {
                stack.addFirst(right);
            }
            if (Objects.nonNull(left)) {
                stack.addFirst(left);
            }
        }
    }
}
