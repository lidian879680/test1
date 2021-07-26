package com.ld.test.dataStruct.binaryTree;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @className PreOrderTraversal_stack
 * @description todo
 * @date 2021/7/26 17:14
 **/
public class InOrderTraversal_stack {
    public static void main(String[] args) {
        TreeNode root = PreOrderTraversal_recursion.initTreeNode();
        InOrderTraversal_stack preOrderTraversal_stack = new InOrderTraversal_stack();
        preOrderTraversal_stack.traveral(root);
    }

    private void traveral(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode current;
        stack.addFirst(root.getRight());
        stack.addFirst(root);
        stack.addFirst(root.getLeft());
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
}
